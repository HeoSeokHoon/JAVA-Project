package com.forest.study4.util;

import java.util.ArrayList;

public class StudyList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//E 변수
		//E = Object
		ArrayList<Object> ar = new ArrayList<Object>();
		ArrayList<Object> ar2 = new ArrayList<>();
		ArrayList<String> ar3 = new ArrayList<>();
		ArrayList<Integer> ar4 = new ArrayList<>();
		
		ar3.add("A");
		String n = ar3.get(0);
		ar.add(1);
		ar.add("second");
		ar.add(false);
		ar.add(4.23);
		//-------------------
		//타입의 안정성 문제 > 다른 사람한테 받은 ArrayList 안에 어떤 형으로 값이 들어 있는지 모른다
		int t = (Integer)ar.get(0);
		String s = (String)ar.get(1);
		boolean c = (Boolean)ar.get(2);
	}

}
