package ch02;

import java.util.Scanner;

public class ForExam {

	public static void main(String[] args) {
		// for

		// for(int i = 0 ; i<10; i++) {
		// System.out.println("1~10 출력값 : " + i);
		// }//for 종료

		// for (int d =1; d<=20 ; d = d+2) {
		// System.out.println("1~10 짝수값 : " + d);
		// }//for d 종료

		// min과 max사이 값에서 감소값 내기

		Scanner inputInt = new Scanner(System.in);
		System.out.print("최소값을 작성하세요 >> ");
		int min = inputInt.nextInt();

		System.out.print("최대값을 작성하세요 >> ");
		int max = inputInt.nextInt();
		
		System.out.print("감소값을 작성하세요 >> ");
		int mus = inputInt.nextInt();
		
		int x = 0;

		for (x = min; x <= max; x=x-mus) {
		System.out.println(min + "~" + max + "에서의 감소값 : " + x);
		
		} //for

	}

}
