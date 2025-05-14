package ch02;

import java.util.Scanner;

public class IfExam {

	public static void main(String[] args) {
		// 
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("귀하의 성함을 입력하세요 : ");
		String name = input.next();
		
		System.out.print("5월 12일 출석한 시험이 맞습니까 : ");
		String ans = input.next();
		
		if (ans.equals("yes") || ans.equals("YES") || ans.equals("Y") || ans.equals("네")) {
		 System.out.println("안녕하세요. 확인되었습니다.");
		 System.out.println("===========================");
		
		int kor = 92;
		int mat = 65;
		int eng = 89;
		int total = kor + mat + eng;
		
		System.out.println(name + "님의 총 합은 : " + total + " 입니다.");
		System.out.println("평균을 내기 위한 총 합을 입력해 주세요.");
		System.out.print(">>>");
		String total2 = input.next();
		
		double avg = total/3;
		System.out.println(name + "님의 평균은 : " + avg + "입니다.");
		System.out.print(name + " 님의 각 과목 등급을 확인하시겠습니까? ");
		String ans2 = input.next();
		System.out.println("===========================");

		if (kor<=80 || kor>=90) {
			System.out.println(name + " 국어 점수는 : " + kor + "입니다.");
			System.out.println(name + "님의 등급은 (A)");
		} else if (kor<=59 || kor>=79) {
			System.out.println(name + " 국어 점수는 : " + kor + "입니다.");
			System.out.println(name + "님의 등급은 (B)");
		} else if (kor<=0 || kor>=49) {
			System.out.println(name + " 국어 점수는 : " + kor + "입니다.");
			System.out.println(name + "님의 등급은 (C)");
		}
		
		if (mat<=80 || mat>=98) {
			System.out.println(name + " 수학 점수는 : " + mat + "입니다.");
			System.out.println(name + "님의 등급은 (A)");
		} else if (mat<=55 || mat>=79) {
			System.out.println(name + " 수학 점수는 : " + mat + "입니다.");
			System.out.println(name + "님의 등급은 (B)");
		} else if (mat<=0 || mat>=54) {
			System.out.println(name + " 수학 점수는 : " + mat + "입니다.");
			System.out.println(name + "님의 등급은 (C)");
		}
		
		if (eng<=80 || eng>=99) {
			System.out.println(name + " 수학 점수는 : " + eng + "입니다.");
			System.out.println(name + "님의 등급은 (A)");
		} else if (eng<=55 || eng>=79) {
			System.out.println(name + " 수학 점수는 : " + eng + "입니다.");
			System.out.println(name + "님의 등급은 (B)");
		} else if (eng<=0 || eng>=54) {
			System.out.println(name + " 수학 점수는 : " + eng + "입니다.");
			System.out.println(name + "님의 등급은 (C)");
		}
	
		} else {
		 System.out.println("다시 입력해주세요. ");
		 
	 }

	}

}
