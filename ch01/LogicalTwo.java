package ch01;

import java.util.Scanner;

public class LogicalTwo {

	public static void main(String[] args) {
		// id, pw
		
		
		String id = "java";
		String pw = "2025";
		
		Scanner input2 = new Scanner(System.in) ; 
		
		System.out.print("id�� �Է��ϼ��� : ");
		String logid = input2.nextLine();
		System.out.println("========id Ȯ��======");
		
		System.out.print("pw�� �Է��ϼ��� : ");
		String logpw = input2.nextLine();
		System.out.println("========pw Ȯ��=======");
		
		if ((logid.equals(id)) & logpw.equals(pw)){
			System.out.println("Ȯ�� �Ǿ����ϴ�. �ȳ��ϼ���. ");
		
		} else {
			System.out.println("��ϵ��� ���� �����Դϴ�.");
			System.out.println("id�� pw �� Ȯ�����ּ���. ");
	
		} // if

	} // main

} //class
