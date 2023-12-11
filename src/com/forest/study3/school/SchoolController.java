package com.forest.study3.school;

import java.util.Scanner;

public class SchoolController {

	public void start() {
		Scanner sc = new Scanner(System.in);
		
		boolean check = true;
		while(check) {
			System.out.println("1. 학생정보입력");
			System.out.println("2. 학생정보출력");
			System.out.println("3. 학생정보검색");
			System.out.println("4. 학생정보추가");
			System.out.println("5. 프로그램종료");
			int select = sc.nextInt();
			
			switch (select) {
			case 1 :
				
				break;

			case 2 :
				break;
			case 3 :
				break;
			case 4 :
				break;
			default:
				System.out.println("프래그램을 종료 합니다.");
				check = false;
			}
		}
	sc.close();
	}
}
