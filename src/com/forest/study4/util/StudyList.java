package com.forest.study4.util;

import java.util.ArrayList;

public class StudyList {
	public static void main (String [] args) {
		// 배열과 비슷
		// 선언시 따로 갯수를 선언 하지 않음
		ArrayList ar = new 	ArrayList();
		// 추가 add
		ar.add("first");//다형성
		ar.add("second");
		ar.add(3);  // int > Integer auto Boxing
		ar.add('a');  // char > Character auto Boxing
		System.out.println(ar.size());
		//삽입
		ar.add(1, 4);
		//수정
		ar.set(0, '1');
		//삭제
		ar.remove(1);
		ar.remove("second");
		//전체삭제
		ar.clear();
		
		for(int i=0;i<ar.size();i++) {
			//get
			System.out.println(ar.get(i));
		}
		
		
		
	}
}
