package com.forest.study7.ex1.client;

public class ClientMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			new ClientController().start();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
