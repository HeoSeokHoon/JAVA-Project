package com.forest.study4.util;

import java.util.Calendar;
import java.util.UUID;

public class StudyCalendar3 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(2023, 11, 31);
		
		System.out.println(calendar.getTime());
		int d = calendar.get(Calendar.DATE);
		d=d+3;
		System.out.println(d);
		calendar.set(Calendar.DATE, d);
		
		System.out.println(calendar.getTime());
		
		calendar.set(2023, 11, 31);
		//calendar.roll(Calendar.DATE, 3);
		calendar.add(Calendar.DATE, 3);
		
		System.out.println(calendar.getTime());
		
		//UUID 유니버설 유니크 아이디
		
		String uuid = UUID.randomUUID().toString();
		System.out.println(uuid);
	}
}
