package ch01;

public class CastingExam {

	public static void main(String[] args) {
		// Casting 강제 타입 변환 복습
		
		int intValue = 103029770 ; 
		// byte byteValue = intValue ; 
		System.out.println(intValue);
		//Type mismatch: cannot convert from int to byte
		
		byte byteValue = (byte) intValue ; //강제 byte값으로 변환
		
		System.out.println("int 값 출력" + intValue);
		System.out.println("byte 값 출력 " + byteValue);
		
		
		int kor = 92 ; 
		int eng = 78 ;
		int mat = 89 ; 
		
		int total = kor + eng + mat ; 
		System.out.println("================성적표====================");
		System.out.println("세 과목의 총점  : " + total);
		
		int avg = total / 3 ; // 정수타입
		System.out.println("평균 : " + avg);
		
		double avg2 = total / 3 ; // 자동변환 
		System.out.println("평균 : " + avg2);
		
		avg2 = (double)total / 3 ; // 강제변환
		System.out.println("세 과목의 평균 : " + avg2);
		
		
	

	}

}
