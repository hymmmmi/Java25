package ch02;

import java.util.Scanner;

public class SwitchCharExam {

	public static void main(String[] args) {
		// ����ġ ��޹�
		
	Scanner input = new Scanner(System.in);
	
	System.out.println("ȸ������� �Է��ϼ���. ");
	System.out.print("(A~C)>>>");
	
	char gradeChar = input.next().charAt(0);
	
	System.out.println("�Է��� ��� �ڵ� : " + gradeChar);
	
	switch (gradeChar) {
	
	case 'A' :
	case 'a' :
		System.out.println("VIPȸ�� �Դϴ�.");
		break ;
	case 'B' :
	case 'b' :
		System.out.println("�Ϲ�ȸ�� �Դϴ�.");
		break ;
	case 'C' :
	case 'c' :
		System.out.println("����ȸ�� �Դϴ�.");
		break ;
		
	default :
		System.out.println("��ϵ� ȸ�� �ڵ尡 �ƴմϴ�.");
		System.out.println("ȸ�� ������ ���ּ���.");
		System.out.println("ȸ�� ������ �Ͻðڽ��ϱ�? y �Ǵ� n�� �Է����ּ���.");
		System.out.print(">>> ");
		
		String newlogin = input.next();
		
		if (newlogin.equals("y")) {
			System.out.println("ȸ�������� �����մϴ�.");
			System.out.println("���ο� ID�� �Է����ּ���.");
			System.out.print(">>>ID : ");
			String newid = input.next();
			System.out.println(newid + "���� ȸ�������� �Ϸ�Ǿ����ϴ�.");
			System.out.println("�����մϴ�.");
			
		} else if (newlogin.equals("n")) {
			System.out.println("ȸ�������� �����մϴ�.");
			System.out.println("���� ��ȸ�� �˰ڽ��ϴ�.");
		
		}//if������
		
	
		}//����ġ������
	} //main

}//class
