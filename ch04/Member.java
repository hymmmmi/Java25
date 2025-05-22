package ch04;

import java.nio.channels.MembershipKey;
import java.util.Scanner;

public class Member {

	// 필드
	// 회원번호, id, 성명, 암호, 이메일주소, 집주소, 전화번호

	public int mno;
	public String id;
	public String pw;

	// 생성자

	public Member() {

	}

	// 메서드
	Scanner input = new Scanner(System.in);

	public Member memberAdd() {

		Member member1 = new Member(); // 리턴용

		System.out.println("회원가입용 메서드");
		System.out.println("회원번호를 입력하세요.");
		System.out.print("(6자리숫자)>>>");
		member1.mno = input.nextInt();

		System.out.println("회원 id를 입력하세요");
		System.out.print(">>>");
		member1.id = input.next();

		System.out.println("회원 pw를 입력하세요");
		System.out.print(">>>");
		member1.pw = input.next();

		return member1;

	}// add

	public void memberAllList(Member[] members) {
		System.out.println("모든 회원 보기 리스트 메서드 입니다.");
		for (int i = 0; i < members.length; i++) {
			System.out.print("회원번호 : " + members[i].mno);
			System.out.print("회원id : " + members[i].id);
			System.out.print("회원pw : " + members[i].pw);
			System.out.println("------------------------------");
		}

	}

	public Member memberLogin(Scanner input) {
		Member member3 = new Member();

		System.out.println("회원로그인을 합니다.");
		// for(int i=0; i<members.length; i++) {
		System.out.println("회원 id를 입력해주세요."); //로그인 id
		System.out.print(" : id : >>>");
		member3.id = input.next();

		System.out.println("회원 pw를 입력해주세요."); //로그인 pw
		System.out.print(" : pw : >>>");
		member3.pw = input.next();

		if ((member3.id).equals(id) && (member3.pw).equals(pw)) {
			System.out.println("로그인이 되었습니다.");
			System.out.println("안녕하세요.");
		} else if ((member3.id).equals(id) || (member3.pw).equals(pw)) {
			System.out.println("로그인에 실패 하였습니다");
			System.out.println("다시 입력하세요.");
		} // if
		System.out.println("---------------------------");


		return member3;
	}

	public void memberUpdate() {
		Member member4 = new Member();
		
		boolean run = true;
		while(run) {
		System.out.println("회원 정보를 수정합니다.");
		System.out.println("수정 할 회원의 회원번호를 입력하세요");
		System.out.print("(6자리숫자)>>>");
		member4.mno = input.nextInt();
		
		System.out.println("기존의 이메일을 입력해주세요");
		System.out.print(">>>>");
		String mail = input.next();
		
		System.out.println("===수정할 이메일을 입력해주세요");
		System.out.print(">>>");
		String remail = input.next();
		
		System.out.println("----------수정한 내용 확인--------");
		System.out.println("회원번호 : " + mno + "의 메일이 " + mail + "에서 " + remail + "으로 변경되었습니다.");
		
		System.out.println("더 수정 하시겠습니까?");
		System.out.println("1. 네 \t2. 아니요.");
		System.out.print(">>> ");
		int ans = input.nextInt();
		
		switch (ans) {
		
		case 1 : 
			System.out.println("회원 정보를 수정합니다.");
			System.out.println("수정 할 회원의 회원번호를 입력하세요");
			System.out.print("(6자리숫자)>>>");
			member4.mno = input.nextInt();
			
			System.out.println("기존의 이메일을 입력해주세요");
			System.out.print(">>>>");
			String mail2 = input.next();
			
			System.out.println("===수정할 이메일을 입력해주세요");
			System.out.print(">>>");
			String remail2 = input.next();
			
			System.out.println("----------수정한 내용 확인--------");
			System.out.println("회원번호 : " + mno + "의 메일이 " + mail2 + "에서 " + remail2 + "으로 변경되었습니다.");
			
			
		case 2 : 
			System.out.println("수정을 마칩니다.");
			System.out.println("프로그램을 종료하세요.");
			run = false ;
			
		default : 
			System.out.println("프로그램을 종료합니다.");
		}
		
		}
	}

	public void memberDelete() {

	}
}
