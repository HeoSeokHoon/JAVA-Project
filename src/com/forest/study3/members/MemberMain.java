package com.forest.study3.members;

public class MemberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member member = new Member();
//		member.name = "winter";
//		member.muge=65.3;
//		member.age = 20;
		
		member.setName("winter");
		System.out.println(member.getName());
		
		member.setMuge(50.5);
		System.out.println(member.getMuge());
	}

}
