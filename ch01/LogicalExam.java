package ch01;

import java.util.Scanner;

public class LogicalExam {

	public static void main(String[] args) {
		// �α��� Ȯ��

		String ans1 = "��" ; 
		String ans2 = "�ƴϿ�";
						
		Scanner input = new Scanner(System.in);
		
		System.out.print("�α����� �Ͻðڽ��ϱ� ? ");
		String logans = input.nextLine();		
		System.out.println("---- ���� �� --------");
		
		if (ans1.equals(logans)){
			System.out.println("id �� pw�� �Է��ϼ���. ");
			
		} else if (ans2.equals(logans)){
			System.out.println("ȸ�������� ���ּ���. ");
		
		
		} //if
		
	} //mian

} //class
