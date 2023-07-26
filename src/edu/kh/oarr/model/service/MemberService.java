package edu.kh.oarr.model.service;

import java.util.Scanner;

import edu.kh.oarr.model.vo.Member.Member;

public class MemberService {
	private Scanner sc = new Scanner(System.in);
	
	
	// Member 5칸짜리 객체배열 선언 및 할당
	private Member[] memberArr = new Member[5];
	
	public MemberService() { // 기본생성자
		
		// memberArr 배열 0,1,2 인덱스 초기화
		memberArr[0] = new Member("user01", "pass01", "홍길동", 30, "서울");
		memberArr[1] = new Member("user02", "pass02", "계보린", 25, "경기");
		memberArr[2] = new Member("user03", "pass03", "고길동", 45, "강원");
		
	}
	
	// 메뉴 출력용 메서드
	public void displayMenu() {
		// 반환형
		
				int menuNum = 0; // 메뉴 선택용 변수
				
				// 무조건 한번은 반복
				do {
					
					System.out.println("=====회원 정보 관리 프로그램 v2=====");
					System.out.println("1. 회원가입");
					System.out.println("2. 로그인");
					System.out.println("3. 회원 정보 조회");
					System.out.println("4. 회원 정보 수정");
					System.out.println("5. 회원 검색(지역)");
					System.out.println("0. 프로그램 종료");
					
					System.out.println("메뉴 입력 : ");
					menuNum = sc.nextInt();
					sc.nextLine(); // 입력 버퍼에 남은 개행문자 제거용
					
					switch(menuNum) {
					case 1 : System.out.println(signUp()); break;
					case 2 : System.out.println(login()); break;
					case 3 : System.out.println(selectMember()); break;
					case 4 : 
						int result = updateMember();
						
						if(result == -1) {
							System.out.println("로그인 후 이용해주세요.");
						} else if(result == 0) {
							System.out.println("회원 정보 수정 실패 (비밀번호 불일치)");	
						} else { // result == 1
							System.out.println("회원 정보가 수정되었습니다.");
						}
						
						break;
					case 5:
					case 0 : System.out.println("프로그램 종료"); break;
					default : System.out.println("잘못 입력하셨습니다.. 다시 입력해주세요");
					
					}
								
				} while(menuNum != 0); // menuNum 0 이면 반복 종료
				
		
	}

	private int updateMember() {
		return 0;
	}

	private char[] selectMember() {
		return null;
	}

	private char[] login() {
		return null;
	}

	private char[] signUp() {
		return null;
	}
	
}
