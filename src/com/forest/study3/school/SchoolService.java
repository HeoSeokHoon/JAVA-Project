package com.forest.study3.school;

import java.util.Scanner;

public class SchoolService {
	
	//addStu
	//이름, 번호, 점수를 입력 받아서 기존 배열에 추가한 효과
	public void addStudent (Student [] stu) {
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		System.out.println("학생정보를 입력하세요");
		System.out.println("1. 이름 / 2. 점수");
		stu[i].name = sc.next();
		stu[i].num = i+1;
		stu[i].jumsu = sc.nextDouble();
	}
	
	//findByNum
	//학생번로를 입력받아서, 일치하는 학생이 있는지 검색
	//해당학생을 리턴 없으면 null 리턴
	public Student findByNum(Student[] stu) {
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 학생 번호 입력");
		int num = sc.nextInt();
		Student student = null;
		for(int i=0 ;i<stu.length;i++) {
			if(num==stu[i].num) {
//				return stu[i];
				student = stu[i];
				break;
			}
		}return student;
	}
	
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
