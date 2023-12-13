package com.forest.study3.himart;

public class Customer {
	
	
	private int money;
	private int point;
	
	public Customer() {
		this.money=2000;
		this.point=10;
	}
	
	public void buy(ProductParent p) {
		//물건값 계산
		this.money=this.money-p.getPrice();
		this.point=this.point+p.getPoint();
		
		
		//최종 가진돈과 포인트를 출력
		System.out.println("현재 가지고 있는 돈 : "+this.money+"만원");
		System.out.println("현재 적립 포인트 : "+this.point+"점");
		
		System.out.println(p instanceof Television);
	}

	
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
	
	
}
