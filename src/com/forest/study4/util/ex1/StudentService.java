package com.forest.study4.util.ex1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

import com.forest.study3.school.Student;

public class StudentService {
	
	
	private String info;
	private Scanner sc;
	
	public StudentService() {
		this.sc = new Scanner(System.in);
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
	public StudentDTO findByName(ArrayList<StudentDTO> ar) {
		System.out.println("학생의 이름을 입력");
		String name = sc.next();
		
		StudentDTO st = null;
		
		for(StudentDTO studentDTO:ar) {
			if(studentDTO.getName().equals(name)) {
				st = studentDTO;
				break;
				//return studentDTO;
			}
		}//return null;
		return st;
	}
	
	
	//학생정보추가 studentAdd
	public void studentAdd(ArrayList<StudentDTO> ar) {
		StudentDTO studentDTO = new StudentDTO();
		System.out.println("학생의 이름 입력");
		studentDTO.setName(sc.next());
		
		System.out.println("번호를 입력");
		int num = sc.nextInt();
		studentDTO.setNum(num);

		System.out.println("국어점수 입력");
		studentDTO.setKor(sc.nextInt());
		
		System.out.println("영어점수 입력");
		studentDTO.setEng(sc.nextInt());

		System.out.println("수학점수 입력");
		studentDTO.setMeth(sc.nextInt());
		
		studentDTO.setSum(studentDTO.getKor()+studentDTO.getEng()+studentDTO.getMeth());
		studentDTO.setAvr(studentDTO.getSum()/3.0);
		
		ar.add(studentDTO);
	}
	
	//학생정보삭제 studentDelete 이름으로 검색해서 삭제
	public boolean studentDelete(ArrayList<StudentDTO> ar) {
		System.out.println("삭제할 학생 이름을 입력");
		String name = sc.next();
		boolean result = false;
		
		for(StudentDTO studentDTO:ar) {
			if(studentDTO.getName().equals(name)) {
				ar.remove(studentDTO); //ArrayList의 주소를 가지고 리무브
				result = true;
				break;
			}
		}
		
		return result; //블리언을 리턴해서 뷰 메서드에서 추가(성공 or 실패 메세지 출력)
	}
}
