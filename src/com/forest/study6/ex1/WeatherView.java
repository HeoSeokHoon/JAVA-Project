package com.forest.study6.ex1;

import java.util.List;

public class WeatherView {
	
	public void view (List<WeatherDTO> ar) {
		System.out.println("도시명\t기온\t날씨\t습도");
		for(WeatherDTO weatherDTO:ar) {
			System.out.print(weatherDTO.getName()+"\t");
			System.out.print(weatherDTO.getGion()+"\t");
			System.out.print(weatherDTO.getInfo()+"\t");
			System.out.println(weatherDTO.getHum()+"%");
			System.out.println("====================================");	
		}
	}
	
	public void view(WeatherDTO arr) {
		if(arr==null) {
			System.out.println("찾는 지역이 없습니다");
			return;
		}
		System.out.print(arr.getName()+"\t");
		System.out.print(arr.getGion()+"\t");
		System.out.print(arr.getInfo()+"\t");
		System.out.println(arr.getHum()+"%");
		System.out.println("====================================");
	}
}
