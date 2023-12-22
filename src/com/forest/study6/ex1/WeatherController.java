package com.forest.study6.ex1;

import java.util.List;
import java.util.Scanner;

public class WeatherController {
	//의존적이다	Dependency
	//주입		injection
	//의존성 주입
	private WeatherDAO weatherDAO;
	private WeatherView weatherView;
	private Scanner sc;
	
	public WeatherController() {
		//강한 결합
		this.weatherDAO = new WeatherDAO();
		this.weatherView = new WeatherView();
		this.sc = new Scanner(System.in);
		
	}
	
	public WeatherController(WeatherDAO weatherDAO) {
		//느슨한 결합
		this.weatherDAO = weatherDAO;
	}

	public void start() throws Exception {
		List<WeatherDTO> ar = weatherDAO.read();
		
		boolean check=true;
		while(check) {
			System.out.println("1. 날씨정보출력");
			System.out.println("2. 날씨정보검색");
			System.out.println("3. 날씨정보추가");
			System.out.println("4. 날씨정보삭제");
			System.out.println("5. 날씨정보저장");
			System.out.println("6. 프로그램종료");
			try {
				int select = sc.nextInt();
				if(select==1) {
					this.weatherView.view(ar);
				}else if(select==2) {
					WeatherDTO w = weatherDAO.getDetail(ar, sc);
					weatherView.view(w);
				}else if(select==3) {
					boolean falg = weatherDAO.add(ar, sc);
				}else if(select==4) {
					boolean falg = weatherDAO.delete(ar, sc);
				}else if(select==5) {
					weatherDAO.save(ar);
				}else {
					System.out.println("프로그램 종료");
					check=false;
				}
			}catch(Exception e){
				System.out.println(sc.next()+"는 잘못된 입력입니다");
			}
		}
	}
	
	
	public void setWeatherDAO(WeatherDAO weatherDAO) {
		this.weatherDAO = weatherDAO;
	}
	
	

}
