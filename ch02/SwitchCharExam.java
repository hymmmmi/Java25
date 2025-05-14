package ch02;

import java.util.Scanner;

public class SwitchCharExam {

	public static void main(String[] args) {
		// 스위치 등급문
		
	Scanner input = new Scanner(System.in);
	
	System.out.println("회원등급을 입력하세요. ");
	System.out.print("(A~C)>>>");
	
	char gradeChar = input.next().charAt(0);
	
	System.out.println("입력한 등급 코드 : " + gradeChar);
	
	switch (gradeChar) {
	
	case 'A' :
	case 'a' :
		System.out.println("VIP회원 입니다.");
		break ;
	case 'B' :
	case 'b' :
		System.out.println("일반회원 입니다.");
		break ;
	case 'C' :
	case 'c' :
		System.out.println("새싹회원 입니다.");
		break ;
		
	default :
		System.out.println("등록된 회원 코드가 아닙니다.");
		System.out.println("회원 가입을 해주세요.");
		System.out.println("회원 가입을 하시겠습니까? y 또는 n을 입력해주세요.");
		System.out.print(">>> ");
		
		String newlogin = input.next();
		
		if (newlogin.equals("y")) {
			System.out.println("회원가입을 진행합니다.");
			System.out.println("새로운 ID를 입력해주세요.");
			System.out.print(">>>ID : ");
			String newid = input.next();
			System.out.println(newid + "님의 회원가입이 완료되었습니다.");
			System.out.println("감사합니다.");
			
		} else if (newlogin.equals("n")) {
			System.out.println("회원가입을 종료합니다.");
			System.out.println("다음 기회에 뵙겠습니다.");
		
		}//if문종료
		
	
		}//스위치문종료
	} //main

}//class
