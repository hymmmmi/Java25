package ch02;

import java.util.Scanner;

public class IfExam {

	public static void main(String[] args) {
		// 
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("������ ������ �Է��ϼ��� : ");
		String name = input.next();
		
		System.out.print("5�� 12�� �⼮�� ������ �½��ϱ� : ");
		String ans = input.next();
		
		if (ans.equals("yes") || ans.equals("YES") || ans.equals("Y") || ans.equals("��")) {
		 System.out.println("�ȳ��ϼ���. Ȯ�εǾ����ϴ�.");
		 System.out.println("===========================");
		
		int kor = 92;
		int mat = 65;
		int eng = 89;
		int total = kor + mat + eng;
		
		System.out.println(name + "���� �� ���� : " + total + " �Դϴ�.");
		System.out.println("����� ���� ���� �� ���� �Է��� �ּ���.");
		System.out.print(">>>");
		String total2 = input.next();
		
		double avg = total/3;
		System.out.println(name + "���� ����� : " + avg + "�Դϴ�.");
		System.out.print(name + " ���� �� ���� ����� Ȯ���Ͻðڽ��ϱ�? ");
		String ans2 = input.next();
		System.out.println("===========================");

		if (kor<=80 || kor>=90) {
			System.out.println(name + " ���� ������ : " + kor + "�Դϴ�.");
			System.out.println(name + "���� ����� (A)");
		} else if (kor<=59 || kor>=79) {
			System.out.println(name + " ���� ������ : " + kor + "�Դϴ�.");
			System.out.println(name + "���� ����� (B)");
		} else if (kor<=0 || kor>=49) {
			System.out.println(name + " ���� ������ : " + kor + "�Դϴ�.");
			System.out.println(name + "���� ����� (C)");
		}
		
		if (mat<=80 || mat>=98) {
			System.out.println(name + " ���� ������ : " + mat + "�Դϴ�.");
			System.out.println(name + "���� ����� (A)");
		} else if (mat<=55 || mat>=79) {
			System.out.println(name + " ���� ������ : " + mat + "�Դϴ�.");
			System.out.println(name + "���� ����� (B)");
		} else if (mat<=0 || mat>=54) {
			System.out.println(name + " ���� ������ : " + mat + "�Դϴ�.");
			System.out.println(name + "���� ����� (C)");
		}
		
		if (eng<=80 || eng>=99) {
			System.out.println(name + " ���� ������ : " + eng + "�Դϴ�.");
			System.out.println(name + "���� ����� (A)");
		} else if (eng<=55 || eng>=79) {
			System.out.println(name + " ���� ������ : " + eng + "�Դϴ�.");
			System.out.println(name + "���� ����� (B)");
		} else if (eng<=0 || eng>=54) {
			System.out.println(name + " ���� ������ : " + eng + "�Դϴ�.");
			System.out.println(name + "���� ����� (C)");
		}
	
		} else {
		 System.out.println("�ٽ� �Է����ּ���. ");
		 
	 }

	}

}
