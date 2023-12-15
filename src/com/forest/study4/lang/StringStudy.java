package com.forest.study4.lang;

import java.util.Scanner;

public class StringStudy {


	public static void main(String[] args) {
		Object obj1 = new Object();

		Scanner sc = new Scanner(System.in);
		//String 
		String name="winter";//불변
		String name2 = "winter";
		
		System.out.println(name == name2);
		System.out.println("이름 입력");
		String name3=sc.next();
		System.out.println(name.equals(name3));
		
		char ch = name.charAt(1);
		System.out.println(ch);
		
		for(int i=0;i<name.length();i++) {
			System.out.println(name.charAt(i));
		}
		
		
		String n = "abc";
		String n2 = "123";
		n = n+n2;
		System.out.println("1"+1+2+"23");
		

	}
	
}
