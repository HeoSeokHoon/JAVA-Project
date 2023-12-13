package com.forest.study3.himart;

public class Television extends ProductParent {
	private String color;

	public Television() {
		this.color="black";
		this.setSize(100);
		this.setPrice(1000);
		this.setBrand("samsung");
		this.setPoint(25);
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
}
