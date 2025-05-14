package ch02;

public class ForSumExam {

	public static void main(String[] args) {
		// for - while
		// for로 만든 합계문으로 while 문으로 
		
		
		int sum = 0 ;
		int i =1 ; 
		while(i<=100) {
			sum = sum+i;
			i++;
			
			System.out.println("1~" + (i-1)+"까지의 합 : " + sum);
		
		} //while

	}//main

}//class
