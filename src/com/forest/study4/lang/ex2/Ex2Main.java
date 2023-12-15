package com.forest.study4.lang.ex2;

import java.util.Scanner;

import javax.swing.filechooser.FileNameExtensionFilter;

public class Ex2Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호 입력");  // 991225-1234567
		String pass = sc.next();
		
		
		//1. 남자 여자 구별
		int gender = Integer.parseInt(pass.substring(7, 8));
		if(gender%2==0) {
			System.out.println("여자입니다");
		}else {
			System.out.println("남자입니다");
		}
		//2. 대략 나이
		int age = Integer.parseInt(pass.substring(0, 2));
		if(gender==1||gender==2||gender==5||gender==6) {			
			System.out.println(2023-1900-age+"세 입니다");
		}else if(gender==3||gender==4||gender==7||gender==8) {
			System.out.println(2023-2000-age+"세 입니다");
		}
		//3. 태어난 계절
		int weather = Integer.parseInt(pass.substring(2, 4));
		if(weather >= 3 && weather <= 5) {
			System.out.println("태어난 계절은 봄 입니다.");
		}else if(weather >= 6 && weather <= 8){
			System.out.println("태어난 계절은 여름 입니다.");
		}else if(weather >= 9 && weather <= 11){
			System.out.println("태어난 계절은 가을 입니다.");
		}else {
			System.out.println("태어난 계절은 겨울 입니다.");
		}
		//4. 주민 타당
		int [] arr = {2,3,4,5,6,7,8,9,2,3,4,5};
		char [] arrpass = pass.toCharArray();
		int [] newpass = new int [arrpass.length-1];
		int [] result = new int [newpass.length-1];
		int j=0;
		for(int i=0;i<newpass.length;i++,j++) {
			if(arrpass[j]=='-') {
				j=j+1;
			}
			newpass[i] = Integer.parseInt(arrpass[j]+"");
		}
		int finish=0;
		for(int i=0;i<result.length;i++) {
			result[i]=newpass[i]*arr[i];
			finish = finish+result[i];
		}
		finish = finish%11;
		finish = 11-finish;
		boolean check = true;
		while(check) {
			if(finish==newpass[12]) {
				System.out.println("정상적인 주민번호 입니다.");
				check=false;
			}else if(finish>=10) { 
				finish=finish%10;
			}else if(finish<10) {
				check=false;
				System.out.println("잘못된 주민번호 입니다.");
			}
		}
		// 9 9 1 2 2 5 - 1 2 3 4 5 6    7
		// 2 3 4 5 6 7   8 9 2 3 4 5  
		// 차례로 곱하고 총합계 구함
		// ex)122 11로 나눈 나머지를 구함
		// 11에서 나머지를 뺸 결과를 끝자리와 비교(같아야함)
		// 만약에 결과가 2자리라면 그 나머지를 10으로 나눈 나머지를 구해서 체크번호와 비교
		
		
				
		
		
		
		
		
		
	}
}
