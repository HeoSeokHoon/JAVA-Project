package com.forest.study3.rpg;

public class Magiction {

	int level;
	boolean gender;
	String skill;
	String status;
	
	String name;
	int hp;
	int mp;
	public void move() {
		System.out.println("이동하세요");
	}
	public void info() {
		String localName="abc";
		System.out.println(this);
		System.out.println("Name : "+this.name);
		System.out.println("Hp : "+this.hp);
//		this.t1();
//		t1();
	}
	
	public void t1() {
		System.out.println("Test 메서드 입니다.");
//		this.info();
	}
}
