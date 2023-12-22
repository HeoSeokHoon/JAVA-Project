package com.forest.study7;

public class ClientMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			new Client().send();			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
