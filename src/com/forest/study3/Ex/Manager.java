package com.forest.study3.Ex;

import java.util.Scanner;

public class Manager {
	
private Scanner sc;
	
	public Manager() {
		sc = new Scanner(System.in);
	}
	
	public Data[] addData(Data [] datas) {		
		Data addData = new Data();
		System.out.println("번호입력");
		addData.setNum(sc.nextInt());
		
		System.out.println("회사입력");
		addData.setCompany(sc.next());
		
		System.out.println("이름입력");
		addData.setName(sc.next());
		
		System.out.println("직책입력");
		addData.setGrade(sc.next());
		
		System.out.println("연락처입력");
		addData.setPhone(sc.next());
		
		System.out.println("이메일입력");
		addData.setMail(sc.next());
		
		System.out.println("주소입력");
		addData.setAddress(sc.next());
		
		if(datas == null) {
			Data[]newDatas = new Data[1];
			newDatas[0]=addData;
			return newDatas;
		}else {
			Data[] newDatas = new Data[datas.length+1];			
			for(int i=0;i<datas.length;i++) {
				newDatas[i]=datas[i];
			}
			newDatas[datas.length]=addData;
			return newDatas;
		}
	}
	
	public Data [] deleteData(Data [] datas) {
		System.out.println(datas.length);
		Data[] newData = new Data[datas.length-1];
				System.out.println("삭제할 번호를 입력하세요");
				int select = sc.nextInt();
				int count=0;
				for(int i=0;i<newData.length;i++) {
					if(select==datas[i].getNum()) {
						newData[count]=datas[i];
						count=count-1;
					}else { 
						newData[count]=datas[i];
					}
					count++;				
				}
		
		return newData;
	}
	
	public void listData(Data [] datas) {
		for(int i=0;i<datas.length;i++) {
			System.out.println("번호: "+datas[i].getNum()+" 이름: "+datas[i].getName()+" 회사: "+datas[i].getCompany());
		}
	}
	
	public void detailData(Data [] datas) {
		System.out.println("원하는 번호를 입력하세요");
		int select = sc.nextInt();
		
		for(int i=0;i<datas.length;i++) {
			if(select==datas[i].getNum()) {
				System.out.println("번호: "+datas[i].getNum()+" 이름: "+datas[i].getName()+" 회사: "+datas[i].getCompany());
				System.out.println("직책: "+datas[i].getGrade()+" 연락처: "+datas[i].getPhone()+" 이메일: "+datas[i].getMail()+" 주소: "+datas[i].getAddress());
			}
			
		}
	}
	
}
