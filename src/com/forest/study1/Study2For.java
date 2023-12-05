package com.forest.study1;

import java.util.Scanner;

public class Study2For {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id = 1234;
		int pw = 5678;

//		 아이디와 패스워드를 입력받아서 로그인 성공여부 판단
		for(int i = 0 ; i < 5 ; i++) {
			int num = sc.nextInt();
			if(num == id) {
				System.out.println("로그인 성공");
				i = 4;
			}else {
				new Scanner(System.in);
				System.out.println("로그인 실패 : "+(i+1)+"회");
			}
		}
		
	}

}
