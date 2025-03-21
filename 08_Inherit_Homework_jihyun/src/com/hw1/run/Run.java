package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 3명의 학생 정보를 기록할 수 있게 객체 배열 할당
		Student[] std = new Student[3];

		// 위의 사용데이터 참고하여 3명의 학생 정보 초기화
		std[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
		std[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
		std[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");

		// 반복문을 통해 출력
		// for / while
		// 향상된 for 문
		/*
		 * 자바에서 배열, 컬렉션과 같은 데이터를 순차적으로 간단하게 반복할 수 있는 구조를 제공 일반적인 for 문보다 코드가 더 간결하고 가독성이
		 * 좋아서 반복작업을 더 쉽게 작성할 수 있다
		 * 
		 * for(데이터타입 변수명 : 배열 또는 컬렉션) { 반복해서 실행할 코드 }
		 */

		for (Student s : std) {
			System.out.println(s.information());
		}

		// 위의 학생 정보 모두 출력
		System.out.println(std[0].information());
		System.out.println(std[1].information());
		System.out.println(std[2].information());
		System.out.println(
				"-----------------------------------------------------------------------------------------------");

		// 최대 10명의 사원 정보를 기록할 수 있게 배열 할당
		Employee[] emp = new Employee[10];

		int count = 0;

		// 사원들의 정보를 키보드로 계속 입력 받고 -->while(true) 무한 반복문
		while (true) {
			emp[count] = new Employee();

			System.out.print("이름 : ");
			String name = sc.next();
			emp[count].setName(name);

			System.out.print("나이 : ");
			int age = sc.nextInt();
			emp[count].setAge(age);

			System.out.print("신장 : ");
			double height = sc.nextDouble();
			emp[count].setHeight(height);

			System.out.print("몸무게 : ");
			double weight = sc.nextDouble();
			emp[count].setWeight(weight);

			System.out.print("급여 : ");
			int salary = sc.nextInt();
			emp[count].setSalary(salary);

			System.out.print("부서 : ");
			String dept = sc.next();
			emp[count].setDept(dept);

			System.out.print("계속 추가할래?(y/n) : ");
			String answer = sc.next().toUpperCase(); // 대문자로 치환

			if (answer.equals("N")) {
				count++;
				continue;

			} else if (answer.equalsIgnoreCase("Y")) { // 대소문자 가리지 않음
				for (int i = 0; i < emp.length; i++) {
					if (emp[i] != null) {
						System.out.println(emp[i].information());
					}
				}
				break;
			}

		}

		// 계속 추가할 것인지 물어보고, 대소문자 상관없이 'y'이면 계속 객체 추가

		// 한명씩 추가될 때마다 카운트함

		// 2명 정도의 사원 정보를 입력받아 객체 배열에 저장

		// 현재 기록된 사원들의 정보 모두 출력
	}

}
