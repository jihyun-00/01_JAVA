package com.hw2.run;

import java.util.Scanner;

import com.hw2.model.dto.Monkey;
import com.hw2.model.dto.Tiger;
import com.hw2.model.service.Zoo;

public class Run {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// Zoo 객체 생성
		Zoo zoo = new Zoo();

		// Tiger 객체 생성하여 zoo에 추가하기
		zoo.addAnimal(new Tiger("호랑이"));
		//Tiger tig = new Tiger("호랑이");
		//zoo.addAnimal(tig);

		// Monkey 객체 생성하여 zoo에 추가하기
		zoo.addAnimal(new Monkey("원숭이"));
		//Monkey mon = new Monkey("원숭이");
		//zoo.addAnimal(mon);
		
		

		// 동물원 메뉴 출력하여 입력한 값대로 코드 수행하기
		zoo.displayAnimals();

	}
}
