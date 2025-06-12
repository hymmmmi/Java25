package example;

import java.util.Scanner;

public class SlotMachExam {

	public static void main(String[] args) {
		// 자판기 프로그램 실습

		Scanner inputInt = new Scanner(System.in);
		Scanner inputStr = new Scanner(System.in);

		System.out.println("======자판기======");
		System.out.println("원하시는 모드를 선택하세요");
		System.out.println("1. 관리자모드 \n2. 사용자모드 ");
		System.out.print(">>>");
		int mode = inputInt.nextInt();

		if (mode == 1) {
			
			boolean run = true;
			String id = "abc";
			String pw = "1234";
			boolean session = false;
			
			while (session) {
				System.out.println("관리자 로그인 메뉴입니다.");
				session = logIn(id, pw, session);
				if (session == true) {
					System.out.println("관리자로 로그인 합니다.");
					System.out.println(id + "님 안녕하세요");

				} else {
					System.out.println("관리자가 아닙니다.");
					System.out.println("다시 로그인 하세요.");

				}
			}
			
				System.out.println("====관리자 모드를 실행합니다.====");
				System.out.println("등록할 메뉴 수를 입력하세요.");
				System.out.print(">>> ");
				int count = inputInt.nextInt(); //메뉴의 수
				String[] menus = new String[count]; // 메뉴입력
			int[] pays = new int[count];//메뉴의가격
			int[] refils = new int[count];//메뉴의 리필횟수
			int[] totals = new int[count];//합계

			boolean run2 = true;

			while (run2) {

				System.out.println("======관리자모드 메뉴=====");
				System.out.println("1. 메뉴 등록");
				System.out.println("2. 가격 변경");
				System.out.println("3. 음료 리필");
				System.out.println("4. 통계");
				System.out.print(">>> ");
				int select = inputInt.nextInt();

				switch (select) {

				case 1:
					name(menus, pays, refils);
					break;

				case 2:
					price(menus, pays);
					break;

				case 3:
					counts(menus, refils);
					break;

				// case 4 :
				// totals(menus,refils,totals);
				// break;

				}// switch

			} // while

			} else if (mode == 2) {
			System.out.println("====사용자 모드를 실행합니다.====");

			} else {
			System.out.println("모드를 다시 입력하세요.");
		}

	}

	static boolean logIn(String id, String pw, boolean session) {
		// 관리가 로그인
		Scanner inputlogIn = new Scanner(System.in);
		System.out.println("id를 입력하세요");
		System.out.print(">>>> ");
		String inputId = inputlogIn.next();
		System.out.println("pw를 입력하세요");
		System.out.print(">>>> ");
		String inputPw = inputlogIn.next();
		
		if (inputId.equals(id) && inputPw.equals(pw)) {
			System.out.println("관리자로 로그인합니다.");
			System.out.println("안녕하세요.");
			
		}else { 
			System.out.println("다시 입력하세요.");
		}
		
		return session;
	}

	// private static void totals(String[] menus, int[] refils, int[] totals) {
	// 총 메뉴의 가격

	// }

	static void counts(String[] menus, int[] refils) {
		// 리필횟수 작성

		Scanner inputInt = new Scanner(System.in);
		Scanner inputStr = new Scanner(System.in);

		System.out.println("메뉴의 리필 횟수를 입력하세요.");

		for (int i = 0; i < menus.length; i++) {
			System.out.println("메뉴를 이름을 입력하세요.");
			System.out.print(">>> ");
			menus[i] = inputStr.next();

			System.out.println("리필가능 횟수를 등록하세요.");
			System.out.print(">>> ");
			refils[i] = inputInt.nextInt();

			System.out.println("리필 횟수가 등록되었습니다");
		}

	}

	static void price(String[] menus, int[] pays) {
		// 가격변경
		Scanner inputInt = new Scanner(System.in);
		Scanner inputStr = new Scanner(System.in);

		System.out.println("등록된 메뉴의 가격을 수정합니다.");

		for (int i = 0; i < menus.length; i++) {
			System.out.println("수정할 메뉴를 입력하세요.");
			System.out.print(">>> ");
			menus[i] = inputStr.next();

			System.out.println("가격을 수정하세요");
			System.out.print("가격 : ");
			pays[i] = inputInt.nextInt();

			System.out.println("=======수정한 메뉴 확인======");
			System.out.println("가격이 수정되었습니다.");

		} // 수정for

	}

	// main

	static void name(String[] menus, int[] pays, int[] refils) {
		// 메뉴등록

		Scanner inputInt = new Scanner(System.in);
		Scanner inputStr = new Scanner(System.in);

		for (int i = 0; i < menus.length; i++) {

			System.out.println("등록할 메뉴를 입력하세요.");
			System.out.print(">>> ");
			menus[i] = inputStr.next();

			System.out.println("가격을 등록하세요");
			System.out.print("가격 : ");
			pays[i] = inputInt.nextInt();

			System.out.println("=======등록한 메뉴 확인======");
			System.out.println("메뉴가 등록되었습니다.");

		} // 등록for
	}

}// class
