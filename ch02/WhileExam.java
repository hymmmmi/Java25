package ch02;

import java.util.Scanner;

public class WhileExam {

	public static void main(String[] args) throws Exception {
		// 키보드 입력 제어문
		// 숫자 1을 입력하면 속도를 증가하고 숫자2를 입력하면
		// 속도를 감소하고 숫자 3을 누르면 종료하는 프로그램을 작성

		// 숫자1 : 49, 숫자2: 50, 숫자3 :51

		Scanner input = new Scanner(System.in);

		boolean run = true; // while run값
		int speed = 100; // 속도
		int keyCode = 0; // 키보드 값

		while (run) {
			if (keyCode != 13 && keyCode != 10) {
				System.out.println("---------------");
				System.out.println("1. 엑셀 | 2. 브레이크 | 3. 중지");
				System.out.println("---------------");
				System.out.print("선택 : "); 

			} //if
			keyCode = System.in.read();
				

			if (keyCode == 49) {
				speed = speed + 3;
				System.out.println("현재속도 : " + speed);

			} else if (keyCode == 50) {
				speed = speed - 3;
				System.out.println("현재속도 : " + speed);

			} else if (keyCode == 51) {
				run = false;
				System.out.println("크루즈 기능이 종료됩니다.");
				System.out.println("현재 속도 : " + speed);
				System.out.println("안전 운전 하세요!");

			} // if


		} // while
		System.out.println("프로그램종료");
	}// main

}// class
