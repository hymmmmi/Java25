package ch01;

public class OperatianExam {

	public static void main(String[] args) {
		// ������ ��� ����
		
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
		System.out.println("x + y �� 10���� " + result3);
		
		// 3�׿����ڸ� ����Ͽ� 5�� ����� ã��.
		
		int a = 25 ; 
		int b = a % 5 ; 
		String f = (b == 0) ? "�´�" : "�ƴϴ�" ; 
		System.out.println("a�� 5�� ����� " + f);
		
		// Ȧ¦ �����
		
		int x1 = 13 ; 
		int div = x1 % 2 ; 
		String z1 = (div == 1) ? "Ȧ��" : "¦��" ; 
		System.out.println("x1�� " + z1);
		

	}

}
