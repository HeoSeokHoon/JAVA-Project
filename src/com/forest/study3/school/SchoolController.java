package com.forest.study3.school;

import java.util.Scanner;

public class SchoolController {

	public void start() {
		Scanner sc = new Scanner(System.in);
		SchoolService service = new SchoolService();
		Student [] stu = null;
		
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
				stu = service.makeStudents();
				break;

			case 2 :
				SchoolView view = new SchoolView();
				view.view(stu);
				break;
			case 3 :
				break;
			case 4 :
				break;
			default:
				System.out.println("프래그램을 종료 합니다.");
				sc.close();
				check = false;
			}
		}
	}
}
