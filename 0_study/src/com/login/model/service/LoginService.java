package com.login.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.login.model.dto.Member;

public class LoginService {
	
	Scanner sc = new Scanner(System.in);
	List<Member> memberlist = new ArrayList<>();
	List<Member> loginlist = new ArrayList<>();
	
	public LoginService() {

		memberlist.add(new Member("user01", "pass01", "pass01", "홍길동", 30, "서울"));
		memberlist.add(new Member("user02", "pass02", "pass02", "게보린", 25, "경기"));
		memberlist.add(new Member("user03", "pass03", "pass03", "고길동", 45, "강원"));
		
	}
	
	public void displyMenu() {
		
		int menuNum=-1;
		
		do {
		
		System.out.println("\n회원정보 관리 프로그램");
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 회원 정보 조회");
		System.out.println("4. 회원 정보 수정");
		System.out.println("5. 회원 검색(지역)");
		System.out.println("0. 프로그램 종료");
		
		System.out.print("메뉴 입력 : ");
		menuNum =sc.nextInt();
		
		switch(menuNum) {
		case 1 : addMember(); break;
		case 2 : logIn(); break;
		case 3 : viewMember(); break;
		case 4 : editMember(); break;
		case 5 : regionMember(); break;
		case 0 : break;
		
		}
		
		
		
		}while(menuNum!=0);
		
		
	}
	
	public void addMember() {
		System.out.println("\n=====회원가입=====");
		
		System.out.print("아이디 : ");
		String id = sc.next();
		
		System.out.print("비밀번호 : ");
		String pw = sc.next();
		
		System.out.print("비밀번호 확인 : ");
		String pw2 = sc.next();
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.print("지역 : ");
		String region = sc.next();
		
		if(pw.equals(pw2)) {
			memberlist.add(new Member(id, pw, pw2, name, age, region));
			
			System.out.println("회원가입 성공!");
			return;
			
		} else {
			System.out.println("비밀번호가 일치하지 않습니다.");
		}
		
		
		
	}
	
	public void logIn() {
		System.out.println("\n=====로그인=====");
		System.out.print("아이디 : ");
		String id = sc.next();
		
		System.out.print("비밀번호 : ");
		String pw = sc.next();
		
		for(Member m : memberlist) {
			if(m.getId().equals(id) && m.getPw().equals(pw)) {
				loginlist.add(new Member(id, pw));
				System.out.println(m.getName() + "님 환영합니다!");
				return;
			}else {
				System.out.println("아이디 또는 비밀번호가 일치하지 않습니다.");
			}
			
		}
		
		
	}
	
	
	public void viewMember() {
		System.out.println("\n=====회원 정보 조회====");
		for(Member m : memberlist) {
			System.out.println(m.toString());
		}
	}
	
	public void editMember() {
		
		System.out.println("\n=====회원 정보 수정=====");
		
		if(loginlist.size()==0) {
			System.out.println("로그인을 먼저 진행해주세요.");
		} else {
			System.out.print("수정할 이름 입력 : ");
			String memberName = sc.next();
			
			System.out.print("수정할 나이 입력 : ");
			int memberAge = sc.nextInt();
			
			System.out.print("수정할 지역 입력 : ");
			String region = sc.next();
			
			System.out.print("비밀번호 입력 : ");
			String memberPw = sc.next();
			
			if(loginlist.get(0).getPw().equals(memberPw)) {
				
				loginlist.get(0).setName(memberName);
				loginlist.get(0).setAge(memberAge);
				loginlist.get(0).setRegion(region);
				
				System.out.println(loginlist);
				System.out.println("회원정보가 수정되었습니다.");
				
			} else {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
			
			
		}
		
		
		
		
		
	}
	
	public void regionMember() {
		System.out.println("\n=====회원 검색(지역)=====");
		System.out.print("검색할 지역을 입력하세요 : ");
		String inputRegion = sc.next();
		
		System.out.println("[" + inputRegion + "]");
		
		for(Member m : memberlist) {
			if(m.getRegion().equals(inputRegion)) {
				System.out.println(m.toString());
			}
		}
		
	}

}
