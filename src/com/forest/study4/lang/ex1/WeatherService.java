package com.forest.study4.lang.ex1;

public class WeatherService {
	private String datas;
	
	public WeatherService() {
		this.datas="서울-10-비-80-부산-25-맑음-50,대구-82-눈-12,제주.25,태풍.75,천안,33,많은눈,30";
	}
	
	
	//init
	public void init() {
		datas=datas.replace(",", "-");
		datas=datas.replace(".", "-");
		System.out.println(this.datas);
		
		WeatherService weatherService = new WeatherService();
		int arrindx = weatherService.arrIndex(datas);
		String [] arrData = new String[arrindx+1];
		arrData = datas.split("-");
		int leng = (arrData.length)/4;
		
		WeatherData [] weatherDatas = new WeatherData[leng]; 
		for(int i=0;i<leng;i++) {
			WeatherData weatherData = new WeatherData();
			weatherData.setCity(arrData[i*4+0]);			
			weatherData.setGion(arrData[i*4+1]);	
			weatherData.setInfo(arrData[i*4+2]);	
			weatherData.setHum(arrData[i*4+3]);	
			weatherDatas[i]=weatherData;
		}
		for(int i=0;i<leng;i++) {
			System.out.println("지역 :"+weatherDatas[i].getCity()+" / 기온 :"+weatherDatas[i].getGion()+" / 날씨 :"+weatherDatas[i].getInfo()+" / 습도 :"+weatherDatas[i].getHum());
 		}
	}
	
	
	public int arrIndex(String data) {
		int count=0;
		int num=-1;
		while(true) {
			num=data.indexOf("-",num+1);
			if(num==-1) {
				break;
			}
			count++;
		}
		return count;
	}
	
	
}
