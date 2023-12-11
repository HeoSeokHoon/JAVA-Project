package com.forest.study3.school;

public class SchoolView {
	public  void view(Student[] stu) {
		for(int i=0;i<stu.length;i++) {
			System.out.println("번호 : "+stu[i].num+"/ 이름 : "+stu[i].name+"/ 점수 : "+stu[i].jumsu);
		}
	}
}
