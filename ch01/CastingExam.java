package ch01;

public class CastingExam {

	public static void main(String[] args) {
		// Casting ���� Ÿ�� ��ȯ ����
		
		int intValue = 103029770 ; 
		// byte byteValue = intValue ; 
		System.out.println(intValue);
		//Type mismatch: cannot convert from int to byte
		
		byte byteValue = (byte) intValue ; // ���� byte������ ��ȯ
		
		System.out.println("int �� ��� " + intValue);
		System.out.println("byte �� ��� " + byteValue);
		
		
		int kor = 92 ; 
		int eng = 78 ;
		int mat = 89 ; 
		
		int total = kor + eng + mat ; 
		System.out.println("================����ǥ================");
		System.out.println("�� ������ ���� : " + total);
		
		int avg = total / 3 ; // ����Ÿ��
		System.out.println("��� : " + avg);
		
		double avg2 = total / 3 ; // �ڵ���ȯ
		System.out.println("��� : " + avg2);
		
		avg2 = (double)total / 3 ; // ������ȯ
		System.out.println("�� ������ ��� : " + avg2);
		
		
	

	}

}
