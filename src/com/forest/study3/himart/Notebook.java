package com.forest.study3.himart;

public class Notebook extends ProductParent{
	
	private String cpu;
	
	public Notebook() {
		this.cpu="i5";
		this.setBrand("samsung");
		this.setSize(17);
		this.setPoint(60);
		this.setPrice(150);
		
	}
	
	
	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	
	
	
}
