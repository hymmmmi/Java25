
// ������ ������, ��ȣ ��� ������

package ch01;

public class VariableExam {

	public static void main(String[] args) {
		
		int v1 = 25 ; 
		int v2 = 1 ; 
		if(v1>10) {
			v2 = v1 + 5 ;
			
		}
		int v3 = v1 + v2 + 10 ;
		System.out.println("v1�� �� " + v1);
		System.out.println("v2�� �� " + v2);
		System.out.println("v3�� �� " + v3);
		
		
		// if �񱳹��� ��ȣ �ȿ��� �̷����. int ������ ���ʿ��� ������. 
		// ���� ������ ��ȣ �߰��� �ϴ� �� X
		
		
		int kor, mat, eng, total ; 
		double avg ; 
		
		kor = 80 ; 
		mat = 65 ; 
		eng = 88 ; 
		total = kor + mat + eng ; 
		avg = total / 3 ; 
		
		System.out.println("������ " + total +" �̸�,");
		System.out.println("����� " + avg + " �̴�.");
		
		
		// int, double

	}

}
