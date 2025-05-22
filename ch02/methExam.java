package ch02;

import java.util.Scanner;

public class methExam {

	public static void main(String[] args) {
		// 교직원, 학생 로그인, 성적관리메뉴

		Scanner inputStr = new Scanner(System.in);
		Scanner inputInt = new Scanner(System.in);

		boolean run = true;
		String id = "abc";
		String pw = "1234";
		boolean session = false;
		
		boolean torun = true ;
		String sid = "stu" ;
		String spw = "4321";
				
		boolean subsession = false ;

		while (run) {

			System.out.println("======성적관리메뉴=====");
			System.out.println("1. 교직원 로그인");
			System.out.println("2. 학생 로그인");
			System.out.println("3. 성적 관리");
			System.out.println("4. 프로그램 종료");
			System.out.print(">>> ");
			int select = inputInt.nextInt();

			switch (select) {

			case 1 :
				System.out.println("교직원 로그인 메뉴입니다.");
				session = logIn(id, pw, session);
				if (session == true) {
					System.out.println("교직원으로 로그인 합니다.");
					System.out.println(id + "님 안녕하세요");

				} else {
					System.out.println("교직원이 아닙니다.");
					System.out.println("다시 로그인 하세요.");

				} // if
				break;
			case 2 :
				System.out.println("학생 로그인 메뉴입니다.");
				subsession = loginOk(sid,spw,session);
				if (subsession == true) {
					System.out.println("학생으로 로그인 합니다.");
					System.out.println(sid + "님 안녕하세요.");
				}else {
					System.out.println("학생이 아닙니다.");
					System.out.println("다시 로그인 하세요.");
				}//if
				
				break;

			case 3 :
				boolean subrun = true ;
				while(subrun) {
					
				System.out.println("성적 관리 메뉴입니다.");
				System.out.println("a. 성적 등록");
				System.out.println("b. 성적 보기");
				System.out.println("c. 성적 수정");
				System.out.println("d. 성적 삭제");
				System.out.println("z. 메뉴 나가기");
				System.out.print(">>> ");
				char subselect = inputStr.next().charAt(0) ;
				
				switch (subselect) {
									
					case 'A':
					case 'a':
						System.out.println("성적을 등록합니다.");
						break;
					
					case 'B':
					case 'b':
						System.out.println("성적을 확인합니다.");
						break;
						
					case 'C':
					case 'c':
						System.out.println("성적을 수정합니다.");
						break;
						
					case 'D':
					case 'd':
						System.out.println("성적을 삭제합니다.");
						break;
						
					case 'Z':
					case 'z':
						System.out.println("프로그램을 종료합니다.");
						subrun = false ; 
						break ;
						
					
					default :
					System.out.println("a~d까지 메뉴를 선택하세요.");
						
				 } //switch sub
						
				}//while sub
				
				
				
			case 4 : 
				System.out.println("프로그램을 종료합니다.");
				run = false ;
				break ;
				

			}// switch select

		} // while run

	}// main

	static boolean loginOk(String sid, String spw, boolean subsession) {
		// 학생용 로그인

		Scanner inputloginOk = new Scanner(System.in);
		System.out.println("로그인 할 id를 입력하세요.");
		System.out.print("sid >>> ");
		String inputsId = inputloginOk.next();
		System.out.println("pw를 입력하세요");
		System.out.print("spw >>> ");
		String inputsPw = inputloginOk.next();

		if (inputsId.equals(sid) && inputsPw.equals(spw)) {
			System.out.println("id와 pw가 일치합니다.");
			System.out.println("로그인 성공!");
			subsession = true;
		} else {
			System.out.println("id와 pw가 불일치합니다.");
			System.out.println("로그인 실패!");
	
		}//if
		return subsession ;
	}//

		
	static boolean logIn(String id, String pw, boolean session) {
		// 교직원 로그인

		Scanner inputlogIn = new Scanner(System.in);
		System.out.println("로그인 할 id를 입력하세요.");
		System.out.print("id >>> ");
		String inputId = inputlogIn.next();
		System.out.println("pw를 입력하세요");
		System.out.print("pw >>> ");
		String inputPw = inputlogIn.next();

		if (inputId.equals(id) && inputPw.equals(pw)) {
			System.out.println("id와 pw가 일치합니다.");
			System.out.println("로그인 성공!");
			session = true;

		} else  {
			System.out.println("id와 pw가 불일치합니다.");
			System.out.println("로그인 실패!");
			session = false;

		} // if login

		return session;
	}

}// class
