package ch02;

public class For2to9Exam {

	public static void main(String[] args) {
		// 구구단
		// 3단에서 6단 까지만
		
		
		for (int a = 3 ; a<=6 ; a++) {
			System.out.println();
			System.out.println("===="+ a +"단====");
			for (int b=1; b<=9; b++) {
				System.out.println( a + "X" + b + "=" + (a*b) );
			
			} //for
			
		}//for

		// 구구단 짝수단
		
		for (int eve = 2 ; eve <=9; eve=eve+2) {
			System.out.println();
			System.out.println("====="+eve+"단=====");
			
			for (int org =1 ; org<=9; org++) {
				System.out.println(eve + "X" + org + "=" +(eve*org));

			}//for
		}//for
				
	}//main

}//class
