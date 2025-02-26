package com.hw2.run;

import com.hw2.model.dto.Employee;
import com.hw2.model.dto.Person;
import com.hw2.model.service.Company;
import com.hw2.model.service.ManagementSystem;
import com.hw2.model.service.Prison;

public class Run {

	public static void main(String[] args) {

		//company 생성자를 이용하여 10칸짜리 Employee 객체배열 생성하는
		//company 객체를 생성하여 managementSystem 자료형의 company 주소 저장
		Company com = new Company(10);
		ManagementSystem Company = com;
		
		
		//prison 생성자를 이용하여 10칸짜리 Employee 객체배열 생성하는
		//prison 객체를 생성하여 managementSystem 자료형의 prison 주소 저장
		Prison pri = new Prison(10);
		ManagementSystem Prison = pri;
		
		
		//2명 정도 직원 새로 등록
		Person[] person = new Employee[2];
		person[0] = new Employee("EMP001", "유재석", "기획팀");
		person[1] = new Employee("EMP002", "정형돈", "개발팀");
		
		Company.addPerson(person[0]);
		Company.addPerson(person[1]);
		
		//등록한 직원 전체 조회
		Company.displayAllPerson();
		
		//2명 정도 수감자 새로 등록
		//등록한 수감자 전체 조회
		
		
	}

}
