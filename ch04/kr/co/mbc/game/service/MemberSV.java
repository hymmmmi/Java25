package ch04.kr.co.mbc.game.service;

import java.util.Scanner;

import ch04.kr.co.mbc.game.dto.MemberDTO;

public class MemberSV {
	// 회원 서비스용 클래스
	// 필드

	// 생성자

	// 메서드
	public MemberDTO menu(Scanner input, MemberDTO[] memberDTOs, MemberDTO loginState) { // 부메뉴
		System.out.println("--------회원관리 메뉴-------");
		boolean run = true;
		while (run) {

			System.out.println("1. 가입 | 2. 로그인 | 3. 수정 | 4. 삭제 | 5. 종료");
			System.out.print(">>>");
			String select = input.next();

			switch (select) {
			case "1":
				System.out.println("계정을 생성합니다.");
				create(input, memberDTOs); // 계정생성배열
				break;

			case "2":
				System.out.println("로그인을 합니다.");
				loginState = login(input, memberDTOs, loginState); // 로그인배열
				break;

			case "3":
				System.out.println("계정을 수정합니다.");
				break;

			case "4":
				System.out.println("계정을 삭제합니다.");
				break;

			case "5":
				System.out.println("메뉴를 종료합니다.");
				System.out.println("메인 메뉴로 진입합니다.");
				run = false;
				break;

			case "z99":
				System.out.println("관리자 페이지 입니다.");
				break;

			default:
				System.out.println("1~5의 숫자만 입력하세요.");
			}// 스위치
		} // while

		return null;
	}

	private MemberDTO login(Scanner input, MemberDTO[] memberDTOs, MemberDTO loginState) {
		// 로그인
		System.out.println("========로그인========");
		System.out.println("    ID   |   PW    ");
		System.out.println("id를 입력하세요.");
		System.out.print(">>>");
		String id = input.next();
		System.out.println("pw를 입력하세요.");
		System.out.print(">>>");
		String pw = input.next();
		
		MemberDTO loginMember = new MemberDTO();
		loginMember.id = id;
		loginMember.pw = pw;
		
		for(int i = 0; i<memberDTOs.length;i++) {
			if(memberDTOs[i] != null && memberDTOs[i].id.equals(loginMember.id) 
					&& memberDTOs[i].pw.equals(loginMember.pw)) {
				System.out.println("로그인 성공 !!");
				System.out.println(loginMember.id + "님 안녕하세요.");
				break;
			} else if (memberDTOs[i] == null || memberDTOs[i].id.equals(loginMember.id)
					|| memberDTOs[i].pw.equals(loginMember.pw)) {
				System.out.println("로그인 실패 하였습니다. 다시 입력하세요");
				System.out.println("비번 찾기를 하시겠습니까?");
				System.out.println("1. 네 | 2. 종료");
				System.out.print(">>>");
				int ans = input.nextInt();
				
				switch(ans) {
				case 1 :
					System.out.println("------ 비번 찾기 -----");
				
				}
				break;
			}
		}//if		
		
		return loginState;
	}

	private void create(Scanner input, MemberDTO[] memberDTOs) {
		// 계정생성
		System.out.println("=====회원 가입 메뉴입니다=====");
		MemberDTO memberDTO = new MemberDTO(); // 빈 객체 생성

		System.out.println("사용할 id를 입력하세요.");
		System.out.print(">>>");
		memberDTO.id = input.next();
		System.out.println("사용할 pw를 입력하세요.");
		System.out.print(">>>");
		memberDTO.pw = input.next();
		System.out.println("사용할 닉네임을 입력하세요");
		System.out.print(">>>");
		memberDTO.nickName = input.next();
		System.out.println("가입 이메일을 입력하세요");
		System.out.print(">>>");
		memberDTO.email = input.next();
		
		System.out.println("----------등록한 회원 정보---------");
		System.out.println("★★★닉네임 : " + memberDTO.nickName);
		System.out.println("★★★회원id : " + memberDTO.id);
		System.out.println("★★★회원pw : " + memberDTO.pw);
		System.out.println("★★★회원 메일  : " + memberDTO.email);
		System.out.println("------------------------------");
		
		System.out.println(memberDTO.nickName + "님 회원가입을 축하합니다.");

		
		for (int i = 0; i < memberDTOs.length; i++) {
			if (memberDTOs[i] == null) {
				memberDTOs[i] = memberDTO;
				break;
			}//if
		
			
		}//for

	}

}
