package ch02;

import java.util.Scanner;

public class SsnExam {

	public static void main(String[] args) {
		// ����ġ������ �ֹι�ȣ �Է��ϰ� ���� �����ϱ�
		
		Scanner input = new Scanner(System.in);
		 
		System.out.println("�ֹι�ȣ�� �Է��ϼ��� (-�� ����)");
		System.out.print(">>>");
		String num = input.next(); //�ֹι�ȣ�Է� 
		System.out.println("�Է��� �ֹι�ȣ�� : " + num);
		
		char gender = num.charAt(6); // 7��° �������� ����
				
		switch (gender) {
		
		case '1' : case '3' :
			System.out.println("�ѱ��� ���� �Դϴ�.");
			break ;
		case '2' : case '4' :
			System.out.println("�ѱ��� ���� �Դϴ�.");
			break ;
		case '5' : case '7' :
			System.out.println("�ܱ��� ���� �Դϴ�.");
			break ;
		case '6' : case '8':
			System.out.println("�ܱ��� ���� �Դϴ�.");
			break ;
			
		default :
			System.out.println("��ϵ��� ���� �ֹι�ȣ�Դϴ�.");
			System.out.println("�ٽ� �õ����ּ���.");
			
		}//����ġ��1 ����
			
		
		int mon = Integer.parseInt(num.substring(3,4));
		
		if (mon<=0 || mon>=13){
			System.out.println("�߸� �Էµ� �����Դϴ�.");
			System.out.println("�ٽ� Ȯ�����ּ���.");
		} else if (mon>=3 && mon<=5) {
			System.out.println("�¾ ������ �� �Դϴ�.");
		} else if(mon>=6 && mon<=8) {
			System.out.println("�¾ ������ ���� �Դϴ�.");
		} else if(mon>=9 && mon<=11) {
			System.out.println("�¾ ������ ���� �Դϴ�.");
		} else {
			System.out.println("�¾ ������ �ܿ� �Դϴ�.");
		
			
			
			
		}//if
		
	
		

	}//main

}//class
