package com.forest.study1;

import java.util.Scanner;

public class Studt3For {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		0-59분
//		0-59초
//		1분 5초
//		분과 초를 입력
		
		System.out.println("분을 입력하세요");
		int time = sc.nextInt();
		System.out.println("초를 입력하세요");
		int time2 = sc.nextInt();
		
//		반복문을 종료하는 방법
//		1. break를 만났을 때
//		2. 조건식의 값이 false일때
		boolean flag = false;
		for(int i = 0;i<=59;i++) {
			for(int j = 0;j<=59;j++) {
				System.out.println(i+"분 "+j+"초");
				if(time == i && time2 == j) {
					flag=!flag;
					break;
				}
			}
			if(flag) {
				break;
			}
		}
	}

}
