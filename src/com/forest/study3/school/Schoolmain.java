package com.forest.study3.school;

import java.util.Scanner;

public class Schoolmain {

	public static void main(String[] args) {
//		객체를 생성
//		클래스명 변수명 = new 클래스명();
//		Student stu = new Student();
//		stu.name = "winter";
//		stu.num=1;
//		stu.jumsu=3.12;
//		
//		Student stu2 = new Student();
//		stu2.name = "winter";
//		stu2.num=1;
//		stu2.jumsu=3.12;
//		
//		Student stu3 = new Student();
//		System.out.println(stu3.name);
//		System.out.println(stu3.num);
//		
//		Student [] students = new Student[2];
//		students[0] = stu;
//		students[1] = new Student();
//		
//		System.out.println(students[0].name);
//		학생 수를 입력 받아서 학생의 정보를 입력 받기
		
		SchoolController controller = new SchoolController();
		controller.start();
		Scanner sc = new Scanner(System.in);
		System.out.println("학생수를 입력하세요");
		int stuNum = sc.nextInt();
		Student [] stu = new Student[stuNum];
		for(int i=0;i<stu.length;i++) {
			stu[i] = new Student();
			System.out.println("학생 정보를 입력하세요");
			System.out.println("1.이름 / 2.점수");
			stu[i].name = sc.next();
			stu[i].num = i+1;
			stu[i].jumsu = sc.nextDouble();
		}
		for(int i=0;i<stu.length;i++) {
			System.out.println("이름 : "+stu[i].name+" 번호 : "+stu[i].num+" 점수 : "+stu[i].jumsu);			
		}
		sc.close();
	}

}
