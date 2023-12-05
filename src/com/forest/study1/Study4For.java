package com.forest.study1;

import java.util.Scanner;

public class Study4For {
	public static void main(String [] args) {
//		서든 FPS
//		총알 : 30발 탄장 * 3

//		1. 단발모드
//		2. 점사모드
		
		String oneShot = "탕";
		String ThreeShot = "탕탕탕";
		
		Scanner sc = new Scanner(System.in);
		for(int Tan = 1 ; Tan <= 3 ; Tan++) {
			int mode = 0;
			System.out.println("발사모드를 선택하세요 : 1=단발 / 2=점사");
			mode = sc.nextInt();
			if(mode == 1) {
				for(int i = 0; i <= 30 ; i++) {
					System.out.println(oneShot +i);
				}
			}else if(mode == 2) {
				for(int j = 0; j <= 30 ; j+=3) {
					System.out.println(ThreeShot + j);
				}
			}else {
				Tan--;
				}
			}
		sc.close();
	}
}
