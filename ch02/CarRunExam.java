package ch02;

import java.util.Scanner;

public class CarRunExam {

	public static void main(String[] args) {
		// car 주행프로그램만들기
		// c- 시동걸기
		// r- 계기판정보출력
		// u- 주행
		// d- 시동끄기

		Scanner input = new Scanner(System.in);

		boolean run = true;
		int speed = 0; // 속도

		int max = 200; // 최고속도
		int min = 0; // 최저속도

		System.out.println("차량이 입고되었습니다.");
		System.out.println("시동을 켭니다.");
		System.out.println("현재 속도 : " + speed + "km/h");

		while (run) {

			System.out.println("-----------------------");
			System.out.println("1. 시동 걸기");
			System.out.println("2. 엑셀");
			System.out.println("3. 브레이크");
			System.out.println("4. 네비게이션");
			System.out.println("5. 주유하기");
			System.out.println("0. 시동 끄기");

			System.out.println("-----------------------");
			System.out.print("(0~5) 입력하세요 >>> ");

			int select = input.nextInt();

			switch (select) {

			case 1:
				System.out.println("시동을 겁니다.");
				break;

			case 2:
				System.out.println("엑셀을 밟습니다.");
				speed = speed + 30;
				System.out.println("현재 속도 : " + speed + "km/h");

				if (speed >= max) {
					speed = max;
				} // if

				break;

			case 3:
				System.out.println("브레이크를 밟습니다.");
				speed = speed - 20;
				System.out.println("현재속도 : " + speed + "km/h");

				if (speed <= min) {
					speed = min;
				} // if
				break;

			case 4:
				System.out.println("네비게이션을 작동합니다.");
				System.out.println("현재위치를 파악합니다.");
				break;

			case 5:
				System.out.println("주유를 진행합니다.");
				System.out.println("주유구를 열어주세요.");
				break;

			case 0:
				run = false;
				System.out.println("시동을 끕니다.");
				System.out.println("안전 귀가 하세요.");
				break;

			default:
				System.out.println("다시선택하세요.");

			}// switch

		} // while

	}// main

}// class
