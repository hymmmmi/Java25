package ex01;

import java.util.Scanner;

public class mainV2 {

	public static void main(String[] args) {
		// 주메뉴 구현용

		Scanner inputInt = new Scanner(System.in);
		Scanner inputStr = new Scanner(System.in);

		int sel = 0;
		System.out.println("초기작업 : 학생 수를 입력하세요.");
		System.out.print(">>> ");
		int count = inputInt.nextInt();

		String[] names = new String[count] ; // 학생수로 이름
		int[] engs = new int[count]; // 영어
		int[] kors = new int[count]; // 국어
		int[] totals = new int[count]; // 총점
		double[] avgs = new double[count]; // 평균

		boolean run = true;

		while (run) {
			System.out.println("======mbc 교육센터 성적 관리======");
			System.out.println("1. 학생관리\t2. 성적관리\n3. 통계\t4. 프로그램 종료");
			System.out.println("=============================");
			System.out.print(">>> ");
			int select = inputInt.nextInt();

			switch (select) {

			case 1:
				student(names);
				break;

			case 2:
				scores(engs, kors, names);
				break;

			case 3:
				totalScores(totals, engs, kors, names);
				break;

			case 4:
				System.out.println("성적처리가 완료되었습니다.");
				run = false;
				break;

			}// switch

		} // while

	}// main

	static void totalScores(int[] totals, int[] engs, int[] kors, String[] names) {
		// 학생 성적 통계
		Scanner inputInt = new Scanner(System.in);
		Scanner inputStr = new Scanner(System.in);
		
		System.out.println("성적 통계 메뉴입니다.");
		
		int sum = 0;
		for (int i=0 ; i<3; i++) {
			sum += totals[i];
			
		}

		
	}

	static void scores(int[] engs, int[] kors, String[] names) {
		// 학생별 성적
		Scanner inputInt = new Scanner(System.in);
		Scanner inputStr = new Scanner(System.in);
		
		System.out.println("성적을 등록합니다.");

		for (int i = 0; i < names.length; i++) {
			System.out.println("등록할 학생 이름을 입력하세요.");
			System.out.print(">>> ");
			names[i] = inputStr.next();

			System.out.println("국어 점수 : ");
			kors[i] = inputInt.nextInt();

			System.out.println("영어 점수 : ");
			engs[i] = inputInt.nextInt();

		} // 성적 for

		System.out.println("성적 등록이 완료되었습니다.");
		
	} //for scor

	static void student(String[] names) {
		// 학생 이름
		Scanner inputInt = new Scanner(System.in);
		Scanner inputStr = new Scanner(System.in);

		for (int i = 0; i < names.length; i++) {
		System.out.println("학생의 이름을 입력하세요 ");
		System.out.print(">>> ");
		names[i] = inputStr.next();

		}
	} //for name
	
}// class
