package com.forest.study4.util.ex1;

import java.util.ArrayList;

public class StudentView {
	
	//메세지를 출력
	public void view(String str) {
		
	}
	
	
	//학생 1명의 모든 정보를 출력	
	public void view(StudentDTO studentDTO) {
		
	}
	
	
	//학생들의 모든 정보를 출력
	public void view(ArrayList<StudentDTO> ar) {
		//향상된 for문
		// for(모은데이터타입명 변수명 : collection 변수명){}
		for(StudentDTO studentDTO:ar) {
			System.out.println(studentDTO.getName());
			System.out.println(studentDTO.getAvr());
			System.out.println("---------------------");
		}
//		for(int i=0;i<ar.size();i++) {
//			System.out.println(ar.get(i).getName());
//			System.out.println(ar.get(i).getNum());
//			System.out.println(ar.get(i).getKor());
//			System.out.println(ar.get(i).getEng());
//			System.out.println(ar.get(i).getMeth());
//			System.out.println(ar.get(i).getAvr());
//			System.out.println(ar.get(i).getSum());
//		}
	}
}
