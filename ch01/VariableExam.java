
// 변수의 사용범위, 괄호 사용 복습용

package ch01;

public class VariableExam {

	public static void main(String[] args) {
		
		int v1 = 25 ; 
		int v2 = 1 ; 
		if(v1>10) {
			v2 = v1 + 5 ;
			
		}
		int v3 = v1 + v2 + 10 ;
		System.out.println("v1의 값 " + v1);
		System.out.println("v2의 값 " + v2);
		System.out.println("v3의 값 " + v3);
		
		
		// if 비교문은 괄호 안에서 이루어짐. int 선언은 위쪽에서 끝낸다. 
		// 변수 선언을 괄호 중간에 하는 것 X
		
		
		int kor, mat, eng, total ; 
		double avg ; 
		
		kor = 80 ; 
		mat = 65 ; 
		eng = 88 ; 
		total = kor + mat + eng ; 
		avg = total / 3 ; 
		
		System.out.println("총합은 " + total +" 이며,");
		System.out.println("평균은 " + avg + " 이다.");
		
		
		// int, double

	}

}
