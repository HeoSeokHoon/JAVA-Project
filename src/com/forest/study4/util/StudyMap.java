package com.forest.study4.util;

import java.util.HashMap;

public class StudyMap {
	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("K1", 1);
		map.put("K2", 2);
		map.put("K1", 6);
		
		System.out.println(map);
		
		Integer num = map.get("K2");
		System.out.println(num);
		
	}
}
