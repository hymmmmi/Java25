package ch01;

import java.util.Scanner;

public class LogicalExam {

	public static void main(String[] args) {
		// 로그인 확인

		String ans1 = "네" ; 
		String ans2 = "아니요";
						
		Scanner input = new Scanner(System.in);
		
		System.out.print("로그인을 하시겠습니까 ? ");
		String logans = input.nextLine();		
		System.out.println("---- 검증 중 --------");
		
		if (ans1.equals(logans)){
			System.out.println("id 와 pw를 입력하세요. ");
			
		} else if (ans2.equals(logans)){
			System.out.println("회원가입을 해주세요. ");
		
		
		} //if
		
	} //mian

} //class
