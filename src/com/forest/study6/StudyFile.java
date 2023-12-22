package com.forest.study6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class StudyFile {
	
	public void f4() throws Exception{
		File file = new File("c:\\study\\test2.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		while(true) {
			String s = br.readLine();
			if(s==null) {
				break;
			}
			if(!s.isEmpty()) {
				System.out.println(s);							
			}
		}
		br.close();
		fr.close();
	}
	
	public void f3() throws Exception{
		Scanner sc = new Scanner(System.in);
		File file = new File("c:\\study\\test2.txt");
		FileWriter fw = new FileWriter(file, true);
		
		while(true) {
			System.out.println("메세지 입력");
			String message = sc.next();//exit, Exit, eXit 종료
			if(message.toUpperCase().equals("EXIT")) {
				break;
			}
			fw.write(message+"\r");
			fw.flush();
		}
		
		fw.close();
		
	}
	
	public void f2() throws Exception{
		File file = new File("c:\\study");
		
		File [] files =file.listFiles();
		
		String [] ar = file.list();
		for(String s : ar) {
			System.out.println(s);
			System.out.println(s.length());
			File f= new File(file, s);
			System.out.println(f.length());
		}
	}

	public void f1() throws Exception {
		File file = new File("c:\\study\\Test.java");
		
		file = new File("c:\\study\\test", "sub1");
		
		if(!file.exists()) {
			//file.mkdirs();
			file.mkdir();
		}
		
		file = new File(file, "t1.txt");
		
		file.createNewFile();
		
		System.out.println(file.exists());
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		System.out.println(file.length());
		
		file = new File("c:\\study\\test\\sub1\\t1.txt");
		
		file.delete();
	}
}
