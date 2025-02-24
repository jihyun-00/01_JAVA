package edu.kh.oarr.model.service;

import java.util.Scanner;

import edu.kh.oarr.model.vo.Member;

public class MemberService {

	// 속성
	private Scanner sc = new Scanner(System.in);

	// 회원가입한 사람의 정보를 저장해둘 참조변수
	// Member 5칸짜리 객체배열 선언 및 할당
	private Member[] memberArr = new Member[5];

	// 현재 로그인한 회원의 정보를 저장할 참조 변수 선언
	private Member loginMember = null;

	public MemberService() {
		// memberArr 배열 0,1,2 인덱스 초기화
		memberArr[0] = new Member("user01", "pass01", "홍길동", 30, "서울");
		memberArr[1] = new Member("user02", "pass02", "게보린", 25, "경기");
		memberArr[2] = new Member("user03", "pass03", "고길동", 45, "강원");
	}

	// 기능
	public void displayMenu() {
		
		int menuNum = 0; //메뉴 선택용 변수
		
		//무조건 한번은 반복
		do {
			
			System.out.println("회원정보 관리 프로그램 v2.");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 회원 정보 조회");
			System.out.println("4. 회원 정보 수정");
			System.out.println("5. 회원 검색(지역)");
			System.out.println("0. 프로그램 종료");
			
			System.out.print("메뉴 입력 : ");
			menuNum = sc.nextInt();
			//입력 버퍼에 남은 개행문자 제거
			sc.nextLine();
			
			switch(menuNum) {
			case 1 : System.out.println(signUp());break;
			case 2 : System.out.println(login()); break;
			case 3 : System.out.println( selectMember() ); break;
			case 4 : System.out.println( updateMember() );break;
			case 5 : searchRegion(); break;			
			case 0 : System.out.println("프로그램 종료"); break;
			default : System.out.println("다시 입력하세요.");
			}
			
			
		} while(menuNum !=0);
		
	}
	
	//memberArr의 비어있는 인덱스 번호를 반환하는 메서드
	// 단, 비어있는 인덱스가 없다면 -1 반환
	public int emptyIndex() {
		
		// memberArr 배열을 0 인덱스부터 끝까지 접근해서
		 // 참조하는 값이 null인 경우의 인덱스를 반환
		for(int i=0; i<memberArr.length; i++) {
			
			if(memberArr[i] ==null) {
				return i;
				//현재 메서드 종료하고 호출한 곳으로 i 값을 가지고 돌아감
			}
			
		}
		
		
		//for문을 수행했지만 return이 되지 않은 경우 해당 위치 코드 수행됨
		//-> for문에서 return 되지 않았다 == 배열에 빈칸이 없다.
		return -1;

	}
	
	
	
	//회원가입용 메서드
	public String signUp() {
		
		System.out.println("\n========회원가입========");
		
		// memberArr배열에 빈자리가 있는지 확인
		// 객체배열 memberArr에 새로 가입할 회원정보를 저장할 예정
		// -> 빈공간의 인덱스 번호 얻어오기
		int index = emptyIndex(); //memberArr배열에서 비어있는 인덱스 반환받음
								  // 없다면 -1
		
		if(index == -1) { //비어있는 공간 없음 -> 회원가입 불가
			return "회원가입 불가능합니다.(인원 수 초과)";
		}
		
		//회원가입 가능일 때
		System.out.print("아이디 : ");
		String memberId = sc.next();
		
		System.out.print("비밀번호 : ");
		String memberPw = sc.next();
		
		System.out.print("비밀번호 확인 : ");
		String memberPw2 = sc.next();
		
		System.out.print("이름 : ");
		String memberName = sc.next();
		
		System.out.print("나이 : ");
		int memberAge = sc.nextInt();
		
		System.out.print("지역 : ");
		String region = sc.next();
		
		//비밀번호, 비밀번호 확인이 일치하면 회원가입 진행
		//일치하지 않으면 회원가입 실패
		
		if( memberPw.equals(memberPw2)) { //일치하는 경우
			
			//새로운 Mwmber 객체 생성해서 할당된 주소를
			//memberArr의 비어있는 인덱스에 대입
			memberArr[index] = new Member(memberId, memberPw, memberName, memberAge, region);
			
			return "회원가입 성공!";
		} else { //불일치
			
			return  "회원가인 실패 (비밀번호 불일치)";
			
		}
	}

	//로그인 메서드
	public String login() {
		
		System.out.println("\n======로그인=====");
		
		// 1) 아이디, 비밀번호 입력받기
		System.out.print("아이디 : ");
		String memberId = sc.next();
		
		System.out.print("비밀번호 : ");
		String memberPw = sc.next();
		

		
		// 2) memberArr 배열 내 요소를 순서대로 접근하여
		for(int i=0; i<memberArr.length; i++) {
			
			// 2-1) 현재 접근한 요소가 null인지 아닌지 확인
			if(loginMember != null) {
				// 2-2) 회원정보가 있을 경우
				// 		-> 회원정보의 아이디, 비밀번호가 입력받은 아이디, 비밀번호가 같은지 비교
				if(memberArr[i].getMemberId().equals(memberId)
						&& memberArr[i].getMemberPw().equals(memberPw)) {
					// 2-3) 같다면 로그인 회원 정보 객체를 참조할 변수 loginMember에
					//		현재 접근 중인 memberArr[i] 요소에 저장된 주소를 얕은 복사
					loginMember = memberArr[i];
					break;
					// 3) 로그인 성공/실패 여부에 따라 결과 값 반환
					//	-> 로그인 성공 : 홍길동님 환영합니다!
				}
			}
			
		}
		if(loginMember == null ) {
			return "아이디 또는 비밀번호가 일치하지 않습니다.";
		} else {
			return loginMember.getMemberName() +"님 환영합니다.";
		}
		
	}

	//회원 검색(지역) 메서드
	public void searchRegion() {
		
		System.out.println("\n======회원 검색(지역)======");
		System.out.print("검색할 지역을 입력하세요 : ");
		String inputRegion = sc.next();
		
		//1) memberArr 배열의 모든 요소 순차 접근
		boolean flag = true;		
		
		//2) memberArr[i] 요소가 null인 경우 반복 종료
		for(int i=0; i<memberArr.length; i++) {
			if(memberArr[i] == null) {
				break;
			}
			//3) memberArr[i] 요소가 null이 아니라면
			//	memberArr[i]요소에 저장된 지역(region)이
			//	입력받은 지역(inputRegion)과 같을 경우
			//	memberArr[i] 요소에 저장된 객체의
			
			if(memberArr[i].getRegion().equals(inputRegion)) {
				System.out.printf("아이디 : %s, 이름 : %s\n",
						memberArr[i].getMemberId(), memberArr[i].getMemberName());
				flag = false; //찾았다는 신호
			}
		}
		
		//	회원의 아이디, 이름을 출력
		
		
		//4) 입력한 지역와 일치하는 회원이 없다면
		//	일치하는 검색 결과가 없습니다 출력
		if(flag) {
			System.out.println("일치하는 검색결과가 없습니다.");
		}
	}
	
	//회원 정보 조회
	public String selectMember() {

		System.out.println("======회원 정보 조회======");
		
		//1) 로그인이 되어있지 않으면 -1 반환
		if(loginMember == null) {
			return "로그인 후 이용바람";
		}
		
		return "이름 : " + loginMember.getMemberName() + "\n" +
		"아이디 : " + loginMember.getMemberId() + "\n" +
		"나이 : " + loginMember.getMemberAge() + "\n" +
		"지역 : " + loginMember.getRegion();
		
	}
	
	
	//회원 정보 수정
	public int updateMember() {
	
		
		System.out.println("======회원 정보 수정======");
		
		//1) 로그인이 되어있지 않으면 -1 반환
		if(loginMember == null) {
			System.out.println("로그인 후 이용바람");
			
			return -1;
		}
		
		System.out.print("수정할 이름 입력 : ");
		String memberName = sc.next();
		
		System.out.print("수정할 나이 입력 : ");
		int memberAge = sc.nextInt();
		
		System.out.print("수정할 지역 입력 : ");
		String region = sc.next();
		
		System.out.print("비밀번호 입력 : ");
		String memberPw = sc.next();
		
		//2) 비밀번호가 다를 경우 0 반환
		if(loginMember.getMemberPw().equals(memberPw)) {
			loginMember.setMemberName(memberName);
			loginMember.setMemberAge(memberAge);
			loginMember.setRegion(region);
			
			return 1;
		} else {
			System.out.println("회원정보 수정 실패(비밀번호 불일치)");
			return 0;
		}
		
		//3) 비밀번호가 같을 경우(수정 이루어짐) 1반환
		
	}
}
