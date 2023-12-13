package com.forest.study3.himart;

public class Cellphone extends ProductParent{
	
	private int pixel;
	private String model;
	
	
	public Cellphone() {
		this.pixel = 1000;
		this.model = "ipone15pro";
		this.setBrand("Apple");
		this.setPoint(25);
		this.setPrice(150);
		this.setSize(30);
	}
	
	public int getPixel() {
		return pixel;
	}
	public void setPixel(int pixel) {
		this.pixel = pixel;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	
	
}
