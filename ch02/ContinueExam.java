package ch02;

public class ContinueExam {

	public static void main(String[] args) {
		// continue 문
		
		for(int i =1 ; i <=20; i++) {
			if(i%2 !=0) {
		     //i%2 !=1 짝수
		 
				continue ; 
			}//if
			
			System.out.println(i);
			
		}//for

	}//main

}//class
