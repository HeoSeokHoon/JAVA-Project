package com.forest.study7.ex1.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class ClientController {

	
	
//	public ClientController(Scanner sc) {
//		
//	}
	
	public void start() throws Exception {
		//1.서버와 소켓 연결 시도
		
		//1.날씨정보출력
		//2.날씨정보검색
		//3.프로그램종료
		//스캐너를 외부에서 만들거나 내부에서 만들어서 쓸 수 있다
		//외부에서 만드는 경우는 다른 클래스(객체)에서 사용할 경우
		//내부에서 만드는 경우는 현재클래스에서 쓰고 버려지는 경우
		Scanner sc = new Scanner(System.in);
		ClientView cv = new ClientView();
		boolean check = true;
		while(check) {
			System.out.println("메뉴 선택");
			System.out.println("1. 서버연결 및 서비스실행");
			System.out.println("2. 종료");
			int m = sc.nextInt();
			switch(m) {
			case 1:{
				if(m==1) {
					Socket socket = new Socket("localhost", 8282);
					System.out.println("서버연결 성공");
					OutputStream os = socket.getOutputStream();
					OutputStreamWriter ow = new OutputStreamWriter(os);
					BufferedWriter bw = new BufferedWriter(ow);
					InputStream is = socket.getInputStream();
					InputStreamReader ir = new InputStreamReader(is);
					BufferedReader br = new BufferedReader(ir);
					boolean check2 = true;
					while(check2) {
						System.out.println("원하는 메뉴 선택");
						System.out.println("1. 날씨정보출력");
						System.out.println("2. 날씨정보검색");
						System.out.println("3. 이전메뉴");
						System.out.println("4. 프로그램종료");
						int n = sc.nextInt();
						if(n==1) {
							bw.write("1\n\r");
							bw.flush();
							String data = br.readLine();
							ArrayList<ClientDTO> al = cv.ClientDAO(data);
							cv.view(al);
						}else if(n==2) {
							
						}else if(n==3) {
							bw.write("4\n\r");
							bw.flush();
							check2 = false;
						}else {
							bw.write("4\n\r");
							bw.flush();
							System.out.println("시스템을 종료합니다.");
							m = 2;
							check = false;
							check2 = false;
						}
					}
				}
				break;
			}
			case 2:{
				System.out.println("시스템을 종료합니다.");
				check = false;
			}
			}
		}
	}
	
}
