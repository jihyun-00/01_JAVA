package com.kh.inheritance.run;

import com.kh.inheritance.model.dto.BasicPhone;
import com.kh.inheritance.model.dto.SmartPhone;

public class Run {

	public static void main(String[] args) {

		
		//SmartPhone 객체 생성
		SmartPhone smt = new SmartPhone("Samsung", "Galaxy S20", 2020, 1200000, "Andriod", 128);
		
		//BasicPhone 객체 생성
		BasicPhone bsc = new BasicPhone("Nokia", "3310", 2000, 100000, true);
		
		
		smt.printInfo();
		
		System.out.println("======================================");
		
		bsc.printInfo();
		bsc.checkKeyboard();
		
		
		
		
		
	}

}
