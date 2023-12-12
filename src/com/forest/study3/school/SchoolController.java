package com.forest.study3.school;

import java.util.Scanner;

public class SchoolController {

	public void start() {
		Scanner sc = new Scanner(System.in);
		SchoolService service = new SchoolService();
		SchoolView view = new SchoolView();
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
				view.view(stu);
				break;
				
			case 3 :
				Student s = service.findByNum(stu);
				if(s != null) {
					view.view(s);
				}else {
					view.view("학생이 없다");
				}
				break;
			case 4 :
				stu = service.addStudent(stu);
				break;
			default:
				System.out.println("프래그램을 종료 합니다.");
				sc.close();
				check = false;
			}
		}
	}
}
