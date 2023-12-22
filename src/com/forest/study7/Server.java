package com.forest.study7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	
	public void s() throws Exception {
		System.out.println("클라이언트가 접속하길 기다리는 중");
		ServerSocket ss = new ServerSocket(8282);
		Scanner sc = new Scanner(System.in);
		Socket socket = ss.accept();
		System.out.println("Client 연결 성공");
		String m = "";
		InputStreamReader ir=null;
		InputStream is=null;
		BufferedReader br=null;
		OutputStream os=null;
		OutputStreamWriter ow=null;
		BufferedWriter bw=null;
		boolean check = true;
		while(check) {
			is = socket.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			String massage = br.readLine();
			System.out.println(massage);
			if(massage.toUpperCase().equals("EXIT")) {
				check = false;
				break;
			}
			
			System.out.println("클라이언트로 보낼 메세지를 입력하세요");
			m = sc.nextLine();
			
			os = socket.getOutputStream();
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow);
			bw.write(m+"\n\r");
			bw.flush();			
			if(m.toUpperCase().equals("EXIT")) {
				check = false;
				break;
			}
		}
		br.close();
		ir.close();
		is.close();
		if(os!=null) {
			bw.close();
			ow.close();
			os.close();			
		}
		sc.close();
		socket.close();
		ss.close();
		
		System.out.println("서버 종료");
	}
}
