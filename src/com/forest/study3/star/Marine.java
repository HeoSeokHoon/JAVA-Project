package com.forest.study3.star;

public class Marine {
	//접근지정자 [그외지정자] 데이터타입 변수명;
		int hp;
		Gun gun;
		
		//접근지정자 [그외지정자] 리턴타입 메서드명([매개변수 선언들]) - 선언부, header//
		
		//function move(){}
		//이동
		public void move() {
			System.out.println("이동하세요");	
		}
		
		//공격
		
		//멈춤
		
		//정찰
	
	//생성자 선언 문법
	//접근 지정자 메서드명은 클래스명과 동일([매개변수선언]){}
	public Marine() {
		System.out.println("생성자");		
	}
}
