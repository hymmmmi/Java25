package ch02;

import java.util.Scanner;

public class SwitchStringExam {

	public static void main(String[] args) {
		// ����ġ ��Ʈ����
		
		Scanner input = new Scanner(System.in);
		System.out.print("직급을 입력하세요 >>> ");
		String position = input.next() ;
		
		switch (position) {
		case "부장" :
			System.out.println(position + " 성과금 200만원" );
			break ;
		case "과장" :
			System.out.println(position + "  성과금 100만원");
			break ;
		case "대리" :
			System.out.println(position + "  성과금 50만원");
			break ;
			
		default :
			System.out.println("다시 입력하세요");
		}//switch
		
		
		

	}//main

}//class
