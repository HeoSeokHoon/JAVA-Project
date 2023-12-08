package com.forest.study3.rpg;

public class Rpgmain {

	public static void main(String[] args) {
		Magiction user1 = new Magiction();
		user1.gender = false;
		user1.level = 44;
		user1.status = "지능";
		user1.skill = "파이어볼";
		
		System.out.println(user1.gender);
		System.out.println(user1.level);
		System.out.println(user1.status);
		System.out.println(user1.skill);
	}

}
