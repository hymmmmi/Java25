package ch02;

import java.util.Scanner;

public class SsnExam {

	public static void main(String[] args) {
		// 스위치문으로 주민번호 입력하고 남녀 구분하기
		
		Scanner input = new Scanner(System.in);
		 
		System.out.println("주민번호를 입력하세요 (-는 생략)");
		System.out.print(">>>");
		String num = input.next(); //주민번호입력 
		System.out.println("입력한 주민번호는 : " + num);
		
		char gender = num.charAt(6); // 7번째 성별숫자 추출
				
		switch (gender) {
		
		case '1' : case '3' :
			System.out.println("한국인 남자 입니다.");
			break ;
		case '2' : case '4' :
			System.out.println("한국인 여자 입니다.");
			break ;
		case '5' : case '7' :
			System.out.println("외국인 남자 입니다.");
			break ;
		case '6' : case '8':
			System.out.println("외국인 여자 입니다.");
			break ;
			
		default :
			System.out.println("등록되지 않은 주민번호입니다.");
			System.out.println("다시 시도해주세요.");
			
		}//스위치문1 종료
			
		
		int mon = Integer.parseInt(num.substring(3,4));
		
		if (mon<=0 || mon>=13){
			System.out.println("잘못 입력된 숫자입니다.");
			System.out.println("다시 확인해주세요.");
		} else if (mon>=3 && mon<=5) {
			System.out.println("태어난 계절은 봄 입니다.");
		} else if(mon>=6 && mon<=8) {
			System.out.println("태어난 계절은 여름 입니다.");
		} else if(mon>=9 && mon<=11) {
			System.out.println("태어난 계절은 가을 입니다.");
		} else {
			System.out.println("태어난 계절은 겨울 입니다.");
		
			
			
			
		}//if
		
	
		

	}//main

}//class
