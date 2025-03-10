package com.hw2.run;

import com.hw2.model.dto.Employee;
import com.hw2.model.dto.Prisoner;
import com.hw2.model.service.Company;
import com.hw2.model.service.ManagementSystem;
import com.hw2.model.service.Prison;

public class Run {

	public static void main(String[] args) {

		//Company의 생성자를 이용하여 10칸짜리 Employee 객체배열 생성하는 Company 객체를 생성하여
		// ManagementSystem 자료형의 company에 주소 저장
		Company Company = new Company(10);
				
		//Prison의 생성자를 이용하여 10칸짜리 Prisoner 객체배열 생성하는 Prison 객체를 생성하여
		//ManagementSystem 자료형의 Prison에 주소 저장
		ManagementSystem Prison = new Prison(10);
		
		
		//2명 정도 직원 새로 등록
		Company.addPerson(new Employee("EMP001", "유재석", "기획팀"));
		Company.addPerson(new Employee("EMP002", "정형돈", "개발팀"));
		//등록된 전체 직원 조회
		Company.displayAllPerson();
		
		System.out.println("===============================================================");
		
		//2명 정도 수감자 새로 등록
		Prison.addPerson(new Prisoner("1205", "정준하", "밥도둑"));
		Prison.addPerson(new Prisoner("0705", "박명수", "웃음연쇄살인"));
		//등록된 전체 수감자 조회
		Prison.displayAllPerson();
		
		//EMP001 id를 가진 직원 삭제
		Company.removePerson("EMP001");
		//1205 id를 가진 수감자 삭제
		Prison.removePerson("1205");
		
		System.out.println("===============================================================");
		
		//현재 남은 직원 모두 조회
		Company.displayAllPerson();
		//현재 남은 수감자 모두 조회
		Prison.displayAllPerson();
		
		
	}

}
