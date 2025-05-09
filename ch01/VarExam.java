
// 작성목표 :  변수선언 정수, 실수, 문자타입 복습용


package ch01;

public class VarExam {

	public static void main(String[] args) {

		int mach ;
		int distance ; 
		mach = 340 ;
		distance = mach * 60 * 60 ; 
		System.out.println("소리가 1시간 동안 가는 거리 : " + distance + "m");
		
		System.out.println("소리가 1시간 동안 가는 거리");
		System.out.println(distance + "m");
		
		
		// int 정수 타입의 변수

		
		double radius ;
		double area ; 
		radius = 15 ; 
		area = radius * radius * 3.14 ; 
		System.out.println("반지름이 " + radius + "인 원의 반지름은 " + area);
		
		System.out.println("반지름이 " + radius + "인");
		System.out.println("원의 반지름은 " + area);
		
		
		//double 실수타입의 변수
		
		
		char firstName ; 
		char midName ; 
		char lastName ; 
		
		firstName = '김' ; 
		midName = '이' ;
		lastName = '박' ; 
		System.out.println(firstName);
		System.out.println(midName);
		System.out.println(lastName);
		
		System.out.println("가장 많은 성 : " + firstName + midName + lastName );
	}
	
	
	// char 문자타입의 변수
	

}
