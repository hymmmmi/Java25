package ch01;

import java.util.Scanner;

public class LogicalAndOr {

	public static void main(String[] args) {
		// && AND
		
		Scanner input = new Scanner(System.in);
		
	System.out.print("������ �Է��Ͻø� ��ҹ��ڿ� ��ȣ���ڸ� �Ǵ��մϴ�. : ");
	
	int charCode = input.nextInt();
	
	if((charCode>=65) & (charCode<=90)) {
		System.out.println("�Է°��� �빮�� �Դϴ� : " + (char)charCode);
		
	} else if ((charCode>=97) && (charCode<=122)) {
		System.out.println("�Է°��� �ҹ��� �Դϴ�  : " + (char)charCode);
		
	} else if ((charCode>=58) && (charCode<=126)) {
		System.out.println("�����ڵ��� ��ȣ �����Դϴ�. " + (char)charCode);
		
	} else {
		System.out.println("�����ڵ� ǥ�� ���� �����Դϴ�. ");
		System.out.println("�ٽ� �õ� ���ּ���. ");
		
		
		
	} //if
		

	}//main

}//class
