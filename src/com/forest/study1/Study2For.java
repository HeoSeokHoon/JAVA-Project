package com.forest.study1;

import java.util.Scanner;

public class Study2For {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id = 1234;
		int pw = 5678;

//		 아이디와 패스워드를 입력받아서 로그인 성공여부 판단
		boolean check = false;
		String result = "로그인 실패";
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println("ID입력");
			int youId = sc.nextInt();
			System.out.println("PW입력");
			int youPw = sc.nextInt();
			if(youId == id && youPw == pw) {
				check =!check;
				result = "로그인 성공";
				break;				
			}
		}
		System.out.println(result);			
		
	}

}
