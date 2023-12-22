package com.forest.study5;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Study5Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력");
		try {
			int num = sc.nextInt();
			//throw new InputMismatchException();
		
			System.out.println("정상진행");
			String str=null;
		
		//Error
		//int a;
		//System.out.println(a);
		
			Test t = new Test();
		
			int [] arr = new int[2];
			arr[3]=10;
		//new ArrayIndexOutOfBoundsException();
		}catch(InputMismatchException e) {
			
		}catch(ArrayIndexOutOfBoundsException e) {
			
		}catch(RuntimeException e) {
		
		}catch (Exception e) {
		
		}catch(Throwable e) {
			System.out.println("Exception 발생");
		}finally {
			
		}
		
		int a = 10;
		a = a/0;	
		
		ArrayList<Integer> ar = null;
		t.t1(ar);
		
//		System.out.println(str.toString());
		System.out.println("종료 합니다.");
	}

}
