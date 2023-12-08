package com.forest.study2;

import java.util.Scanner;

public class ArrayStudy1 {

	public static void main(String[] args) {
//		배열
//		변수는 값을 하나를 사용함
//		배열은 하나의 변수로 여러개의 값을 사용
//		같은 타입의 데이터만 모음
//		JS는 배열에 값을 추가 하거나 삭제 할 수 있으나
//		JAVA는 배열에 값을 추가 하거나 삭제 할 수 없음
		int num=0;
		int [] ar = new int[3];
		
//		배열의 사용
		ar[0]=5;
		ar[1]=7;
		ar[2]=9;
				
		Scanner sc = new Scanner(System.in);
		String [] names = new String[4];
		for(int i=0 ; i<names.length ; i++) {
			names[i] = sc.next();
		}
		
		
		
		sc.close();
	}

}
