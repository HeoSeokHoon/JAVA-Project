package com.forest.study3.school;

import java.util.Scanner;

public class SchoolService {
	
	//메서드 makeStudents
	//학생수를 입력받아서 학생 수 만큼 학생정보를 입력
	
	public Student[] makeStudents () {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 수를 입력하세요");
		int stuNum = sc.nextInt();
		Student [] stu = new Student[stuNum];
		for(int i=0;i<stu.length;i++) {
			stu[i]=new Student();
			System.out.println("학생정보를 입력하세요");
			System.out.println("1. 이름 / 2. 점수");
			stu[i].name = sc.next();
			stu[i].num = i+1;
			stu[i].jumsu = sc.nextDouble();
		}
		return stu;
	}
	
}
