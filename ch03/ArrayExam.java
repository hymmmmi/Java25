package ch03;

import java.util.Scanner;

public class ArrayExam {

	public static void main(String[] args) {
		//
		//int[] scores = {80, 90, 95};
		
		//System.out.println("scores[0] : " + scores[0]);
		//System.out.println("scores[1] : " + scores[1]);
		//System.out.println("scores[2] : " + scores[2]);
		
		//int sum = 0 ;
		//for(int i=0; i<3;i++) {
		//	sum += scores[i];
			
		//}//for
		
		//System.out.println("총합 : " + sum);
		//double avg = (double) sum/3;
		//System.out.println("평균 : "+avg);
		
		//int[] scores = null;
		//scores = new int[] {56,65,89};
		
		
		//평균계산
		
		int total1 = add(new int[] { 70, 80, 90});
		int total2 = add(new int[] {65,78,92});
		int total3 = add(new int[] {55,89,96});
		
		System.out.println("1반의 총합 : "+total1);
		System.out.println("2반의 총합 : "+total2);
		System.out.println("3반의 총합 : "+total3);
		
		double avg1 = (double) total1/3;
		double avg2 = (double) total2/3;
		double avg3 = (double) total3/3;
		
		System.out.println("1반의 평균 : " + avg1);
		System.out.println("2반의 평균 : " + avg2);
		System.out.println("3반의 평균 : " + avg3);
		
		
	}

	private static int add(int[] scores) {
		int sum =0;
		for(int i=0;i<3;i++) {
			sum += scores[i];
		}
		return sum;
	}//main

}//class
