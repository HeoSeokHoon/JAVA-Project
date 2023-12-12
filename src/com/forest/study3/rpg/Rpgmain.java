package com.forest.study3.rpg;

public class Rpgmain {

	public static void main(String[] args) {
		//변수선언       = 객체 생성
		//클래스명 변수명  = new 클래스명();
		Magiction user1 = new Magiction();
		
		//멤버 사용
		//변수명.멤버변수명
		//변수명.멤버메서드명();
		user1.gender = false;
		user1.level = 44;
		user1.status = "지능";
		user1.skill = "파이어볼";
		user1.move();
		System.out.println(user1.gender);
		System.out.println(user1.level);
		System.out.println(user1.status);
		System.out.println(user1.skill);
		
		Magiction magition = new Magiction();
		magition.name="winter";
		magition.hp=100;
		magition.mp=200;
		
		Magiction magition2 = new Magiction();
		magition2.name="iu";
		magition.info();
		System.out.println(magition);
		magition2.info();
		System.out.println(magition2);
		
	}

}
