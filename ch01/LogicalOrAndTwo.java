package ch01;

import java.util.Scanner;

public class LogicalOrAndTwo {

	public static void main(String[] args) {
		// || OR
		
		
		String id = "jvclass";
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("���̵� �Է����ּ��� : ");
		String logid = input.nextLine();
				
		if ((id == "jvclass") || (id == "��")) {
			System.out.println("��ϵ� ȸ���� �ƴմϴ�. ");
			System.out.println("�ٽ� �õ����ּ���. ");
			
		} 
		
		if ((id == "jvclass") && (id == "��")) {
			System.out.println("ȸ���Դϴ� ^0^. ");
			System.out.println("�ȳ��ϼ���. ");
		
		
		}//if
	}//main

}//class
