package com.forest.study3.cars;

public class Car {
		
	String company;
	String name;
	String color;
	int price;
	Engine engine;
	
	
	
	//기본생성자, default 생성자, 빈생성자)
	public Car() {
		//생성자 내에서 다른 생성자를 호출할 경우
		this("Black");
		
	}
	
	public Car(String color) {
		this("K5", color);
	}
	
	public Car(String name, String color) {
		this.company="Kia";
		this.name="K9";
		this.color=color;
		this.price=3000;
//		this.engine = new Engine();
	}
	
	public Car(Engine engine) {
		this.company="Kia";
		this.name="K9";
		this.color="Black";
		this.price=3000;
		this.engine=engine;
	}
	
	public void info() {
		System.out.println("Company : "+this.company);
		System.out.println("name : "+this.name);
		System.out.println("Color : "+this.color);
		System.out.println("Price : "+this.price);
		
	}

}
