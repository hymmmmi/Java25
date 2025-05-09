package ch01;

public class OperatianExam {

	public static void main(String[] args) {
		// 연산자 사용 복습
		
		int x = 8 ; 
		x++ ; 
		System.out.println("x++ = " + x);
		
		int y = 12 ; 
		int result1 = x + y ; 
		System.out.println("result1 = " + result1);
		
		--y ; 
		System.out.println("--y = " + y);
		
		int result2 = x + y ; 
		System.out.println("x + y = " + result2);
		
		String result3 = (result1>10) ? "up" : "dwn" ; 
		System.out.println("x + y 는 10보다 " + result3);
		
		// 3항연산자를 사용하여 5의 배수를 찾기.
		
		int a = 25 ; 
		int b = a % 5 ; 
		String f = (b == 0) ? "맞다" : "아니다" ; 
		System.out.println("a는 5의 배수가 " + f);
		
		// 홀짝 만들기
		
		int x1 = 13 ; 
		int div = x1 % 2 ; 
		String z1 = (div == 1) ? "홀수" : "짝수" ; 
		System.out.println("x1은 " + z1);
		

	}

}
