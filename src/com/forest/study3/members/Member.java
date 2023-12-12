package com.forest.study3.members;

public class Member {
	private int age;
	private double ki;
	private double muge;
	private String name;
	
	public Member() {}
	
	public Member(double muge) {
		this.muge=muge;
	}
	
	
	//데이터를 입력
	public void setName(String name) {
		this.name=name;
	}
	
	//데이터를 조회
	public String getName() {
		return this.name;
	}
	
	public void setMuge(double muge) {
		if(muge>=0 && muge<300.0) {
			this.muge=muge;			
		}else {
			this.muge=60.0;
		}
	}
	
	public double getMuge() {
			return this.muge;			
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getKi() {
		return ki;
	}

	public void setKi(double ki) {
		this.ki = ki;
	}
}
