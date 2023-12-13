package com.forest.study3.rpg;

public class Magiction extends Character{

	
	private int mp;
	
	public void info() {
		System.out.println(this.getName());
		System.out.println(this.getHp());
		System.out.println(this.getMp());
		
	}
	
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	
}
