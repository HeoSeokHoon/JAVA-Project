package com.forest.study6;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StudyIO {
	
	public void input() {
		//키보드 입력
		InputStream is = System.in; //Byte
		
		InputStreamReader ir = new InputStreamReader(is); //문자
		
		BufferedReader br = new BufferedReader(ir); //문자열
		
		try {
			String str = br.readLine();
			System.out.println(str);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}
