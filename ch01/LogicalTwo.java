package ch01;

import java.util.Scanner;

public class LogicalTwo {

	public static void main(String[] args) {
		// id, pw

		String id = "java";
		String pw = "2025";

		Scanner input2 = new Scanner(System.in);

		System.out.print("id를 입력하세요 : ");
		String logid = input2.nextLine();
		System.out.println("========id 확인======");

		System.out.print("pw를 입력하세요 : ");
		String logpw = input2.nextLine();
		System.out.println("========pw 확인=======");

		if ((logid.equals(id)) & logpw.equals(pw)) {
			System.out.println("확인 되었습니다. 안녕하세요. ");

		} else {
			System.out.println("등록되지 않은 정보입니다.");
			System.out.println("id와 pw 를 확인해주세요. ");

		} // if

	} // main

} // class
