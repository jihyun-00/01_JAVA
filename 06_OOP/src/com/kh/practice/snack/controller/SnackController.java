package com.kh.practice.snack.controller;

import java.util.Scanner;

import com.kh.practice.snack.model.vo.Snack;

public class SnackController {
	
	private Snack s = new Snack();
	Scanner sc = new Scanner(System.in);
	
	
	
	public SnackController() {
		
	}
	
	public String saveData(String kind, String name, String flavor, int numOf, int price) {
		
		
		s.setKind(kind);
		s.setName(name);
		s.setFlavor(flavor);
		s.setNumOf(numOf);
		s.setPrice(price);
		
		return "";
	}
	
	public String confirmData() { //저장된 데이터 반환
		System.out.println("저장 완료되었습니다.");
		System.out.print("저장한 정보를 확인하시겠습니까?(y/n) : ");
		char check = sc.next().charAt(0);
		
		if(check=='y') {
			return s.getKind() + "(" + s.getName() + " - " + s.getFlavor() + ") " + s.getNumOf() + "개 " + s.getPrice() + "원";
		}
		
		return "종료되었습니다.";
		
		
	}

}
