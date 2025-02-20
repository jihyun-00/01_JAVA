package edu.kh.oop.practice.model.service;

import edu.kh.oop.practice.model.vo.Hero;

public class HeroService {
	
	public void practice() {
		
		// 1) 매개변수 생성자를 이용하여 첫번째 Hero 객체 생성(사용 데이터 참고)
		Hero h1 = new Hero("이구역짱", "전사", 200, 20, 1, 0);
		
		// 2) 매개변수 생성자를 이용하여 두번째 Hero 객체 생성(사용 데이터 참고)
		Hero h2 = new Hero("Zi존위자드", "마법사", 100, 100, 1, 0);
		
		// 3) 객체가 가진 필드 값을 매개변수 생성자를 이용하여 객체 생성 시 출력
		
		// 4) 각 객체가 가진 method를 적절히 호출하여 출력결과와 같이 출력
		System.out.println("================" + h1.getNickname() + "시점================");
		h1.attack(100.0);
		h1.attack(50.5);
		h1.attack(49.5);
		h1.dash();
		h1.dash();
		System.out.println(h1.toString());
		
		System.out.println("================" + h2.getNickname() + "시점================");
		h2.attack(300.0);
		h2.dash();
		h2.attack(300.0);
		h2.attack(300.0);
		System.out.println(h2.toString());
		
	}

}
