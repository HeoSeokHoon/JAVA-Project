package com.forest.study4.util.ex1;

import java.util.ArrayList;
import java.util.StringTokenizer;

import com.forest.study3.school.Student;

public class StudentService {
	
	
	private String info;
	
	public StudentService() {
		this.info="winter-1-50-0-80";
		this.info=this.info+"-iu-2-85-94-74";
		this.info=this.info+"-karina-3-78-78-98";
		
	}
	
	
	//init
	//init 파싱 > 이름,번호,국어,영어,수학,총점,평균
	public ArrayList<StudentDTO> init() {
		StringTokenizer st = new StringTokenizer(this.info, "-");
		
		ArrayList<StudentDTO> ar = new ArrayList<>();
		while(st.hasMoreTokens()) {
			StudentDTO studentData = new StudentDTO();
			studentData.setName(st.nextToken());
			studentData.setNum(Integer.parseInt(st.nextToken()));
			studentData.setKor(Integer.parseInt(st.nextToken()));
			studentData.setEng(Integer.parseInt(st.nextToken()));
			studentData.setMeth(Integer.parseInt(st.nextToken()));
			studentData.setSum((studentData.getKor()+studentData.getEng()+studentData.getMeth()));
			studentData.setAvr(studentData.getSum()/3.0);
			ar.add(studentData);
		}
		
		return ar;
	}
	
	//학생정보검색 findByName 이름으로 검색
	
	
	//학생정보추가 studentAdd
	
	
	//학생정보삭제 studentDelete 이름으로 검색해서 삭제
}
