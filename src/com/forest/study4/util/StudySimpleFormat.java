package com.forest.study4.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class StudySimpleFormat {
	public static void main (String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		//2023년 12월 30일
		//calendar.get(Calendar.YEAR)+"년";>>XXXX
		SimpleDateFormat sd = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
		String str = sd.format(calendar.getTime());
		System.out.println(str);
		
		String d = "2020-12-24";
		sd.applyPattern("yyyy-MM-dd");
		
		Date date=null;
		try {
			date = sd.parse(d);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(date);
		
		
	}
}
