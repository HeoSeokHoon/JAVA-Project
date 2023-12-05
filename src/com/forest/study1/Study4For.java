package com.forest.study1;

import java.util.Scanner;

public class Study4For {
	public static void main(String [] args) {

//		1. 로그인 처리
//			a. 로그인 b. 종료
//			-id or pw
		
//		2. MMORPG
//			레벨은 1부터 시작
//			골드 0G
//			1 -> 2 : 3마리
//			2 -> 3 : 6마리
//			3 -> 4 : 9마리
//			......
//			14 -> 15 : 42마리
		
//			레벨이 5레벨 달성 시 1000G 지급
//			레벨이 10레벨 달성 시 2000G 지급
//			레벨이 15레벨 달성 시 3000G 지급
		
//			최종 레벨과 골드를 출력하고 게임 종료
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<3; i++) {
			System.out.println("ID를 입력하세요");
			int userId = sc.nextInt();
			System.out.println("PW를 입력하세요");
			int userPw = sc.nextInt();
			System.out.println("1. 로그인 시도 / 2. 게임종료");
			int select = sc.nextInt();
			if(select == 1) {
				if(userId == 1111 && userPw == 1111) {
					System.out.println("게임시작");
					int level = 1;
					int maxLevel = 15;
					int goldLevel = 5;
					int gold = 0;
					int exp = 0;
					for(level = 1; level <= maxLevel; level++) {
						System.out.println("level = "+level);
						for(exp = 0; exp <= level*3; exp++) {
//								System.out.println("exp = "+exp);
							if(level==goldLevel) {
								goldLevel+=5;
								gold += 1000;
								System.out.println("gold = "+gold);
							}
						}
						if(level == maxLevel) {
							System.out.println("level = "+level+" / gold = "+gold);
							System.out.println("진행 여부를 선택해주세요");
							System.out.println("1. 진행 2. 종료");
							int select2 = sc.nextInt();
							if(select2 == 1) {
								System.out.println("Max 레벨을 설정해주세요");
								maxLevel = sc.nextInt();
							}else {
								i=4;
							}
						}
					}
				}else {
					System.out.println("ID와 PW를 확인하세요");
				}
			}else {
				break;
			}
		}
		System.out.println("게임종료");
		sc.close();
	}
}
