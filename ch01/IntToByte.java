package ch01;

public class IntToByte {

	public static void main(String[] args) {
		// �ڵ�Ÿ�Ժ�ȯ ����.
		
		byte byteValue = 10 ; 
		int intValue = byteValue ; 
		System.out.println(intValue);
		
		char charValue = '��' ; 
		intValue = charValue ; // charValue�� ����������.
		System.out.println("���� �����ڵ� �� = " + intValue);
		
		intValue = 2025 ; // �����
		long longValue = intValue ; // long�� int ���� ū Ÿ�� 
		System.out.println(longValue);
		
		intValue = 507 ; 
		double doubleValue = intValue ; // intq ���� ū double�� �����
		System.out.println(doubleValue);

	}

}
