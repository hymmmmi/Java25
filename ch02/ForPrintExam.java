package ch02;

import java.util.Scanner;

public class ForPrintExam {

	public static void main(String[] args) {
		// 초기화식
		
		Scanner inputInt = new Scanner(System.in);
		
		
		for (int i=0, j=100 ; i<=10 && j>=90 ; i++,j--) {
			System.out.println("i값의 증가 : " + i + " j값의 감소 : " + j);
		}//for

		
		// 1-100까지의 합 구하기
		
		int sum = 0 ; 
		
		for(int i=1 ; i<=100; i++ ) {
			
			sum=sum+i;
			
			System.out.println("합계 : " + sum);
		}//for
		
		
		
	}//main

}//class
