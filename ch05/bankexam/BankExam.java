package ch05.bankexam;

import java.util.Scanner;

import ch05.bankexam.service.HnbankService;

public class BankExam {
	// 필드
	public static Scanner inputStr = new Scanner(System.in);
	public static Scanner inputInt = new Scanner(System.in);

	public static AccountDTO[] hnBank = new AccountDTO[3]; // 하나은행 배열
	public static AccountDTO[] kbBank = new AccountDTO[3]; // 국민 배열
	public static AccountDTO[] shBank = new AccountDTO[3]; // 신한 배열

	// 생성자
	static {
		AccountDTO accountDTO0 = new AccountDTO("하나", "12345-00", "고양이", 50000);
		AccountDTO accountDTO1 = new AccountDTO("국민", "123-45-00", "강아지", 10000);
		AccountDTO accountDTO2 = new AccountDTO("신한", "12-3-45", "토끼", 30000);
		
	}

	// 메서드

	public static void main(String[] args) {
		// 주메뉴 메인
		
		boolean run = true ; 
		while(run) {
			System.out.println("===========================");
			System.out.println("은행 프로그램에 오신걸 환영합니다.");
			System.out.println("===========================");
			System.out.println("1. 하나은행 /t2. 국민은행 /n3. 신한은행/t4. 종료");
			System.out.print(">>>>");
			String select = inputStr.next();
		
			switch(select) {
			
			case "1" : 
				System.out.println("-------하나은행 메뉴입니다--------");
				HnbankService hnbankService = new HnbankService();
				hnbankService.menu(inputStr, inputInt, hnBank); // public으로설정
				break;
			case "2" : 
				System.out.println("-------국민은행 메뉴입니다--------");
				break;
			case "3" : 
				System.out.println("-------신한은행 메뉴입니다--------");
				break;
			case "4" : 
				System.out.println("-------메뉴를 종료합니다--------");
				run = false ;
				break;
			 default : 
				System.out.println("1~4 중에서 입력하세요");
				break;
				
			}
		}
	
	}

}
