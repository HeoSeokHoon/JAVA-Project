package com.forest.study2;

import java.util.Scanner;

public class ArrayStudy4 {

	public static void main(String[] args) {
//		1. 학생정보생성
//			- 학생 수 입력 받음
//			- 학생수 만큼 이름, 번호, 학점
//		2. 학생정보출력
//		3. 학생정보검색
//			- 검색할 학생번호를 입력 받아서 해당학생의 정보를 출력
//		4. 성적순 출력
//		5. 프로그램 종료
		Scanner sc = new Scanner(System.in);
		int [] students = null;
		String [] studentName = null;
		int [] studentNum = null;	
		double [] studentGrade = null;
		System.out.println("메뉴를 선택 하세요");
		System.out.println("1.학생정보생성 2.학생정보출력 3.학생정보검색 4.성적순출력 5.프로그램 종료 ");
		boolean check = true;
		while(check) {
			switch(sc.nextInt()) {
			case 1 :
				System.out.println("학생수를 입력하세요");
				int totalStudent = sc.nextInt();
				students = new int[totalStudent];
				studentName = new String[totalStudent];
				studentNum = new int[totalStudent];	
				studentGrade = new double[totalStudent];
				for(int i=0; i<students.length;i++) {
					System.out.println(i+1+" 번 학생정보를 입력하세요");
					System.out.println("1.이름 / 2.학점");
					studentName[i] = sc.next();
					studentNum[i] = i+1;
					studentGrade[i] = sc.nextDouble();
					System.out.println("이름 : "+studentName[i]+" 번호 : "+studentNum[i]+" 학점 : "+studentGrade[i]);
				}
				System.out.println("메뉴를 선택 하세요");
				System.out.println("1.학생정보생성 2.학생정보출력 3.학생정보검색 4.성적순출력 5.프로그램 종료 ");
				break;
				
			case 2 :
				if(students != null) {
					for(int j=0;j<students.length;j++) {
						System.out.println("이름 : "+studentName[j]+" 번호 : "+studentNum[j]+" 학점 : "+studentGrade[j]);
					}
					System.out.println("메뉴를 선택 하세요");
					System.out.println("1.학생정보생성 2.학생정보출력 3.학생정보검색 4.성적순출력 5.프로그램 종료 ");
					break;
				}
				System.out.println("학생정보를 생성해주세요");
				System.out.println("1.학생정보생성 2.학생정보출력 3.학생정보검색 4.성적순출력 5.프로그램 종료 ");
				break;
				
			case 3 :
				if(students != null) {
					System.out.println("보고싶은 학생 번호를 입력하세요");
					int search = sc.nextInt()-1;
					if(search < students.length) {
						int num = search;
						System.out.println("이름 : "+studentName[search]+" 번호 : "+studentNum[search]+" 학점 : "+studentGrade[search]);
						System.out.println("메뉴를 선택 하세요");
						System.out.println("1.학생정보생성 2.학생정보출력 3.학생정보검색 4.성적순출력 5.프로그램 종료 ");
					}else {
						System.out.println("학생번호는 "+students.length+"번 까지 입니다.");
						System.out.println("1.학생정보생성 2.학생정보출력 3.학생정보검색 4.성적순출력 5.프로그램 종료 ");
					}
					break;
				}
				System.out.println("학생정보를 생성해주세요");
				System.out.println("1.학생정보생성 2.학생정보출력 3.학생정보검색 4.성적순출력 5.프로그램 종료 ");
				break;
				
			case 4 :
				if(students != null) {
					for(int i = 0 ; i<studentGrade.length;i++) {
						for(int j=i+1; j<studentGrade.length;j++) {
							if(studentGrade[i] < studentGrade[j]) {
								double a = studentGrade[i];
								studentGrade[i] = studentGrade[j];
								studentGrade[j] = a;
								String b = studentName[i];
								studentName[i] = studentName[j];
								studentName[j] = b;
								int c = studentNum[i];
								studentNum[i] = studentNum[j];
								studentNum[j] = c;
							}				
						}
					}
					for(int j=0;j<students.length;j++) {
						System.out.println("이름 : "+studentName[j]+" 번호 : "+studentNum[j]+" 학점 : "+studentGrade[j]);
					}
					System.out.println("메뉴를 선택 하세요");
					System.out.println("1.학생정보생성 2.학생정보출력 3.학생정보검색 4.성적순출력 5.프로그램 종료 ");
					break;
				}
				System.out.println("학생정보를 생성해주세요");
				System.out.println("1.학생정보생성 2.학생정보출력 3.학생정보검색 4.성적순출력 5.프로그램 종료 ");
				break;
				
			case 5 :
				check = false;
				break;
			}			
		}
		System.out.println("프로그램이 종료 되었습니다.");
		sc.close();
	}

}

