package com.forest.study7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public void send() throws Exception{
		Scanner sc = new Scanner(System.in);
		Socket socket = new Socket("localhost", 8282); //
		System.out.println("Server in succes");
		String m = "";
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		boolean check = true;
		while(check) {
			System.out.println("서버로 보낼 메세지를 입력하세요");
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
			
			is = socket.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			String massage = br.readLine();
			System.out.println(massage);
			if(massage.toUpperCase().equals ("EXIT")) {
				check = false;
				break;
			}
		}
		bw.close();
		ow.close();
		os.close();
		if(is!=null) {
			br.close();
			ir.close();
			is.close();
		}
		sc.close();			
		socket.close();
		
		
		System.out.println("서비스 종료");
	}
}
