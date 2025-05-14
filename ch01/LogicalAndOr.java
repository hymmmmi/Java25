package ch01;

import java.util.Scanner;

public class LogicalAndOr {

	public static void main(String[] args) {
		// && AND

		Scanner input = new Scanner(System.in);

		System.out.print("정수를 입력하시면 대소문자와 기호문자를 판단합니다. : ");

		int charCode = input.nextInt();

		if ((charCode >= 65) & (charCode <= 90)) {
			System.out.println("입력값이 대문자 입니다 : " + (char) charCode);

		} else if ((charCode >= 97) && (charCode <= 122)) {
			System.out.println("입력값이 소문자 입니다  : " + (char) charCode);

		} else if ((charCode >= 58) && (charCode <= 126)) {
			System.out.println("유니코드의 기호 문자입니다. " + (char) charCode);

		} else {
			System.out.println("유니코드 표의 없는 숫자입니다. ");
			System.out.println("다시 시도 해주세요. ");

		} // if

	}// main

}// class
