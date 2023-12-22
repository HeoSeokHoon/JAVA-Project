package com.forest.study7.ex1.server;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ServerDAO {

	public String sendWeather()throws Exception {
		File file = new File("C:\\study\\weather");
		String [] arr = file.list();
		long fileName = Long.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			long n = Long.parseLong(arr[i].substring(0,arr[i].lastIndexOf(".")));
			fileName = Math.max(fileName, n);
		}
		file = new File(file, fileName+".txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		br.readLine();
		String result="";
		while(true) {
			String s = br.readLine();
			if(s==null) {
				break;
			}
			result = result+s+"-";
		}
		result = result.substring(0,result.lastIndexOf("-"));
		br.close();
		fr.close();
		return result;
	}
}
