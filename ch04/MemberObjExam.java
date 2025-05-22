package ch04;

import java.util.Scanner;

public class MemberObjExam {

	public static void main(String[] args) {
		// 클래스 호출 메인

		Scanner input = new Scanner(System.in);
		Member[] members = null;

		System.out.println("가입할 회원수를 입력하세요");
		System.out.print(">>>");
		int count = input.nextInt();
		members = new Member[count]; // 배열

		System.out.println("회원가입 프로그램을 시작합니다.");

		boolean run = true;
		while (run) {

			System.out.println("1. 회원가입");
			System.out.println("2. 회원전체보기");
			System.out.println("3. 로그인");
			System.out.println("4. 회원수정");
			System.out.println("5. 회원탈퇴");
			System.out.println("1~5까지만 입력하세요(다른키가 눌리면 꺼집니다.)");
			System.out.print(">>>");
			int select = input.nextInt();

			switch (select) {
			case 1:
				Member member1 = new Member(); // 객체생성
				for (int i = 0; i < members.length; i++) {

					member1 = member1.memberAdd();
					members[i] = member1;

				} // for
				break;

			case 2:
				Member member2 = new Member();
				member2.memberAllList(members);
				break;
				
			case 3:
				Member member3 = new Member();
				for (int i = 0 ; i <members.length; i++) {
				
					member3.memberLogin(input);
					members[i] = member3;
					
				}
				break;
			case 4:
				Member member4 = new Member();
				member4.memberUpdate();
				break;
				
			case 5:
				Member member5 = new Member();
				member5.memberDelete();
				break;
				
			default:
				System.out.println("회원가입 프로그램 종료");
				run = false;

			}// switch
		} // while

	}

}
