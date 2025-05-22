package ch02;

import java.util.Scanner;

public class methExamTwo {

	public static void main(String[] args) {
		// 

		Scanner inputStr = new Scanner(System.in);
		Scanner inputInt = new Scanner(System.in);
		
		boolean run = true ;
		String id = "happy";
		String pw = "2025";
		boolean session = false ; //로그인용 id,pw
		
		boolean subrun = true ; 
		String sid = "hi";
		String spw = "0515";
		boolean subsession = false ; //회원가입용 id,pw
		
	
		while (run) {
			System.out.println("================");
			System.out.println("1. 회원 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 게시판");
			System.out.println("4. 탈퇴하기");
			System.out.print(">>> ");
			int select = inputInt.nextInt();
			
			
		}
	} //main

} //class
