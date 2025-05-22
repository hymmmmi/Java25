package ch02;

import java.util.Scanner;

public class DoWhileTest01 {

	public static void main(String[] args) {
		// upAndDown게임
		// 컴퓨터가 랜덤으로 만든 1~31 숫자를 사용자가 맞추는 게임 만들기
		
	   int qus = 0, ans = 0 ; 
				
		Scanner inputInt = new Scanner(System.in);
		
		ans = (int)(Math.random()*31)+1 ;
		
		do {
			System.out.println("1에서 31 까지의 정수를 입력하세요");
			System.out.print(">>> ");
			qus = inputInt.nextInt();
			
			if (qus<ans) {
				System.out.println("up 입니다.");
			} else if (qus>ans) {
				System.out.println("down 입니다.");
				
			}//if
		} while (qus!=ans) ;
			System.out.println("정답입니다." + ans); {
			
		}//while
				
		

	} // main

} // class
