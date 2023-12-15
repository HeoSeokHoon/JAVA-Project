package com.forest.study3.Ex;

import java.util.Scanner;

public class Menu {
	
	public void start () {
		Scanner sc = new Scanner(System.in);		
		boolean check = true;
		Data [] datas = null;
		Manager manager = new Manager();
		
		while(check) {
			System.out.println("----------------");
			System.out.println("기능을 선택하세요");
			System.out.println("1. 목록보기");
			System.out.println("2. 상세보기");
			System.out.println("3. 목록추가");
			System.out.println("4. 목록수정");
			System.out.println("5. 목록삭제");
			System.out.println("6. 종  료");
			System.out.println("----------------");
			int select = sc.nextInt();
			
			
			if(select==1) {
				System.out.println("목록");
				manager.listData(datas);
			}else if(select==2){
				System.out.println("상세");
				manager.detailData(datas);
			}else if(select==3) {
				System.out.println("추가");
				datas = manager.addData(datas);
			}else if(select==4) {
				System.out.println("수정");
			}else if(select==5) {
				System.out.println("삭제");
				datas = manager.deleteData(datas);
			}else if(select==6) {
				check = false;
				System.out.println("프로그램 종료");
			}else {
				System.out.println("메뉴번호 확인");
			}
			
			
		}
		
	}
	
}
