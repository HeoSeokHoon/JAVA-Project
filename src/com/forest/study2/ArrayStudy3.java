package com.forest.study2;

public class ArrayStudy3 {

	public static void main(String[] args) {
		int [] ar = {2,7,5,4,9,1,3,13,6,8,11,10,12};
		for(int i = 0 ; i<ar.length;i++) {
			for(int j=i+1; j<ar.length;j++) {
				if(ar[i] > ar[j]) {
					int a = ar[i];
					ar[i] = ar[j];
					ar[j] = a;
				}				
			}
			System.out.println(ar[i]);
		}
		
		
		
		
		
		

	}

}
