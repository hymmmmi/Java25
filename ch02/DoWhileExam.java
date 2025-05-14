package ch02;

import java.util.Scanner;

public class DoWhileExam {

	public static void main(String[] args) {
		// do-while

		System.out.println("메세지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 q를 입력하세요 : ");
		
		Scanner input = new Scanner(System.in);
		String inputString ; // 키보드로 받는 스트링값
		
		do {
			System.out.print(">>>");
			inputString = input.nextLine();
			System.out.println("전송값 : " + inputString);
		} while (!inputString.equals("q")); {
		System.out.println("프로그램을 종료합니다.");
			
		}//while
		
		
	} //main

}//class
