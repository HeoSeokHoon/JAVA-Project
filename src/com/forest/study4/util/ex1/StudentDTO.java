package com.forest.study4.util.ex1;

public class StudentDTO {
	//Data Transfer Object
	private String name;
	private int num;
	private int kor;
	private int eng;
	private int meth;
	private double avr;
	private int sum;
	
	public double getAvr() {
		return avr;
	}
	public void setAvr(double avr) {
		this.avr = avr;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMeth() {
		return meth;
	}
	public void setMeth(int meth) {
		this.meth = meth;
	}
	
	
}
