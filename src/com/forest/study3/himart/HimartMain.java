package com.forest.study3.himart;

public class HimartMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television tv = new Television();
		Notebook notebook = new Notebook();
		Cellphone phone = new Cellphone();
		
		Customer customer = new Customer();
		customer.buy(tv);
		customer.buy(phone);
		
		ProductParent[] products = new ProductParent[3];
		
		products[0]=tv;
		products[1]=phone;
		products[2]=notebook;
		
	}

}

