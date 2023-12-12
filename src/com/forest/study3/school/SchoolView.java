package com.forest.study3.school;

public class SchoolView {
	
	public void view(String message) {
		System.out.println(message);
	}
	
	public void view(Student stu) {
		System.out.println("번호 : "+stu.num+"/ 이름 : "+stu.name+"/ 점수 : "+stu.jumsu);
	}
	
	public void view(Student[] stu) {
		for(int i=0;i<stu.length;i++) {
//			System.out.println("번호 : "+stu[i].num+"/ 이름 : "+stu[i].name+"/ 점수 : "+stu[i].jumsu);
			this.view(stu[i]);
		}
	}
}
