package com.forest.study7.ex1.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerController {

	public void start() throws Exception {
		//client와 연결 준비
		//
		ServerSocket serverSocket = new ServerSocket(8282);
		System.out.println("서버실행완료");
		ServerDAO sd = new ServerDAO();
		while(true) {
			Socket socket = serverSocket.accept();
			System.out.println("클라이언트 접속");
			
			InputStream is = socket.getInputStream();
			InputStreamReader ir = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(ir);
			
			OutputStream os = socket.getOutputStream();
			OutputStreamWriter ow = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(ow);
			while(true) {
				if(br.readLine().equals("1")) {
					String senddata = sd.sendWeather();
					bw.write(senddata+"\n\r");
					bw.flush();
					System.out.println(senddata);
				}
				if(br.readLine().equals("4")) {
					System.out.println("서버를 종료합니다");
					break;
				}				
			}
		}
	}
}
