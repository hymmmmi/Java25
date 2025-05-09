package ch01;

import java.util.Scanner;

public class LogicalOrAndTwo {

	public static void main(String[] args) {
		// || OR
		
		
		String id = "jvclass";
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("아이디를 입력해주세요 : ");
		String logid = input.nextLine();
				
		if ((id == "jvclass") || (id == "정")) {
			System.out.println("등록된 회원이 아닙니다. ");
			System.out.println("다시 시도해주세요. ");
			
		} 
		
		if ((id == "jvclass") && (id == "정")) {
			System.out.println("회원입니다 ^0^. ");
			System.out.println("안녕하세요. ");
		
		
		}//if
	}//main

}//class
