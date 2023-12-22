package com.forest.study6.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class WeatherDAO {
	private static int count;
	
	static {
		WeatherDAO.count=0;
	}
	//DAO : Data Access Object
	
	//getWeathers
	//file에서 내용을 읽어오는 역할
	
	public ArrayList<WeatherDTO> read() throws Exception{
		File file = new File("C:\\study\\weather"); 
		String [] arr = file.list();
		long fileName=Long.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			arr[i] = arr[i].substring(0,arr[i].lastIndexOf("."));
			long n = Long.parseLong(arr[i]);
			fileName = Math.max(fileName, n);
		}
		ArrayList<WeatherDTO> al = new ArrayList<>();
		file = new File(file, fileName+".txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		br.readLine();
		while(true) {
			String s = br.readLine();
			if(s==null) {
				break;
			}
			WeatherDTO we = new WeatherDTO();
			String [] datas = s.split("-");
			we.setName(datas[0]);
			we.setGion(Integer.parseInt(datas[1]));
			we.setInfo(datas[2]);
			we.setHum(Integer.parseInt(datas[3]));
			al.add(we);					
		}
		
		br.close();
		fr.close();
		return al;
	}
	
	//검색
	public WeatherDTO getDetail(List<WeatherDTO> ar, Scanner sc) {
		System.out.println("도시 이름을 입력하세요");
		WeatherDTO wD = new WeatherDTO();
		wD.setName(sc.next());
		for(WeatherDTO w:ar) {
			if(w.getName().equals(wD.getName())) {
				return w;
			}
		}
		return null;
	}
	
	//추가
	
	public boolean add(List<WeatherDTO> ar, Scanner sc) {
		WeatherDTO weatherDTO = new WeatherDTO();
		System.out.println("도시입력");
		weatherDTO.setName(sc.next());
		System.out.println("기온입력");
		weatherDTO.setGion(sc.nextInt());
		System.out.println("날씨입력");
		weatherDTO.setInfo(sc.next());
		System.out.println("습도입력");
		weatherDTO.setHum(sc.nextInt());
		
		return ar.add(weatherDTO);
	}
	
	//삭제
	public boolean delete(List<WeatherDTO> ar, Scanner sc) {
		boolean result = false;
		System.out.println("도시 입력");
		String city = sc.next();
		for(WeatherDTO wd:ar) {
			if(wd.getName().equals(city)) {
				result = ar.remove(wd);
				break;
			}
		}
		return result; 
	}
	
	//저장
	public void save(List<WeatherDTO> ar) throws Exception {
		//1. 파일에 작성
		//파일명은 save.txt
		//##날씨정보
		//도시명-기온-정보-습도
		//도시명-기온-정보-습도
		//저장할때 파일명을 오늘 날짜+count
		WeatherDAO.count++;
		Calendar ca = Calendar.getInstance();
//		SimpleDateFormat sd = new SimpleDateFormat();
//		sd.applyPattern("yyyyMMdd");
//		String fileName = sd.format(ca.getTime());
//		fileName = fileName+count;
		String fileName = ca.getTimeInMillis()+".txt";
		
		File file = new File("c:\\study\\weather\\"+fileName);
		if(!file.exists()) {
			file.createNewFile();			
		}
		FileWriter fw = new FileWriter(file, false);
		fw.write("##날씨정보\r");
		fw.flush();
		
		//fw.write("도시명-기온-정보-습도");
		for(WeatherDTO arr:ar) {
			String s =(arr.getName()+"-"+arr.getGion()+"-"+arr.getInfo()+"-"+arr.getHum()+"\r");
			fw.write(s);
			fw.flush();
		}
		
		fw.close();
	}
 }
