package com.forest.study4.util.ex2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class StudySetInfo {
	//로또 번호를 랜덤으로 만든다
	//1~45, 6개 
	
	public void ex0 () {
		//배열
		int [] arr = new int[6];
		Random random = new Random();
		for(int i=0;i<arr.length;i++) {
			arr[i] = random.nextInt(45)+1;
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					i--;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
	}
	
	public void ex1_1 (){
		ArrayList<Integer> lotto = new ArrayList<>();
		Random random = new Random();
		boolean check = true;
		while(check) {
			int num = random.nextInt(45)+1;
			if(!lotto.contains(num)){
				lotto.add(num);
			}
			if(lotto.size()==6) {
				check=false;
			}
		}
		for(Integer i:lotto) {
			System.out.println(i);
		}
	}
	
	public void ex1 () {
		//ArrayList
		ArrayList<Integer> lotto = new ArrayList<>();
		Random random = new Random();
		boolean check = true;
		while(check) {
			int num = random.nextInt(45)+1; //0~10미만
			for(int i=0;i<lotto.size();i++)
				if(num==lotto.get(i)) {
					break;
				}else {
					lotto.add(num);
				}
			
			
//			lotto.add(num);						
//			for(int i=0;i<lotto.size();i++) {				
// 				for(int j=i+1;j<lotto.size();j++) {
//					if(lotto.get(i)==lotto.get(j)) {
//						lotto.remove(j);					
//					}
//				}
//			}
			if(lotto.size()==6) {
				check = false;
			}
		}
		for(Integer i:lotto) {
			System.out.println(i);
		}
	}
	
	public void ex2 () {
		//HashSet
		HashSet<Integer> lotto = new HashSet<>();
		Random random = new Random();
		while(lotto.size()!=6) {
			lotto.add(random.nextInt(45)+1);
		}
		System.out.println(lotto);
		
		Iterator<Integer> it = lotto.iterator();
		while(it.hasNext()) {
			Integer num = it.next();
			System.out.println(num);
		}
	}
}
