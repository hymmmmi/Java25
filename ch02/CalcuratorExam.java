package ch02;

import java.util.Scanner;

public class CalcuratorExam {

	public static void main(String[] args) {
		// 계산기 프로그램
		// 순서는 숫자>연산자>숫자로 입력받는다
		// 연산자별로 메서드 숫자넣기, 결과값 return받아서 출력
		// while로 반복재생

		int x1 = 0, x2 = 0, x3 = 0, x4 = 0, x5 = 0; // 변수4개만들기
		boolean run = true, run2 = true;

		String ans = "연산기호"; // 정답표시

		Scanner inputInt = new Scanner(System.in);

		while (run) {

			if (x1 == 0) {
				System.out.println("=====정수계산기=====");
				System.out.println("숫자를 입력해주세요(int 범위내에서)");
				System.out.print(">>>");

				x1 = inputInt.nextInt();

				System.out.println("부호를 선택해주세요.");
				System.out.println("1. +\t2. -\n3. *\t4. %");
				System.out.print(">>>");

				x2 = inputInt.nextInt();

				System.out.println("숫자를 입력해주세요(int 범위내에서)");
				System.out.print(">>>");

				x3 = inputInt.nextInt();

				run2 = true;

				switch (x2) {

				case 1:
					x4 = plus(x1, x3);
					ans = "+";
					break;
				case 2:
					x4 = minus(x1, x3);
					ans = "-";
					break;
				case 3:
					x4 = times(x1, x3);
					ans = "*";
					break;
				case 4:
					x4 = divide(x1, x3);
					ans = "%";
					break;

				// default 생략

				}// switch x2

				System.out.println("계산결과 : " + x1 + " " + ans + " " + x3 + " = " + x4);

				while (run2) {
					if (x4 != 0) {
						System.out.println("1. 종료하기");
						System.out.println("2. 다시하기");
						System.out.println("3. 이어서 계산하기");
						System.out.print(">>> ");
					} else {
						System.out.println("1. 종료하기");
						System.out.println("2. 다시하기");
						System.out.print(">>> ");

					} // run2 if

					x5 = inputInt.nextInt();

					switch (x5) {

					case 1:
						run = false;
						run2 = false;
						break;

					case 2:
						x1 = 0;
						x2 = 0;
						x3 = 0;
						run2 = false;
						break;

					case 3:
						x1 = x4;
						x2 = 0;
						x3 = 0;
						run2 = false;
						break;

					default:
						System.out.println("숫자를 잘못 선택하셨습니다.");
						System.out.println("다시입력하세요.");

					} // switch

				} // while run2

			} // run if

		} // while run

	}// main



	static int plus(int x1, int x3) {
		// 

		int x4 = 0;
		x4 = x1 + x3;
		return x4;
	}// plus
	
	static int minus(int x1, int x3) {
		//
		int x4=0;
		x4=x1-x3 ;
		return x4;
	}//-
	
	static int times(int x1, int x3) {
		// 
		int x4=0;
		x4=x1*x3;
		return x4;
	}//*
	
	static int divide(int x1, int x3) {
		// 
		int x4=0;
		x4=x1/x3;
		return x4;
	}//%


}// class
