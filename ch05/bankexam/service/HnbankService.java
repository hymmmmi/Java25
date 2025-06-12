package ch05.bankexam.service;

import java.util.Scanner;

import ch05.bankexam.AccountDTO;

public class HnbankService {
	//필드
	Scanner inputInt = new Scanner(System.in);
	Scanner inputStr = new Scanner(System.in);
	
	//생성자
	
	//메서드
	
	public void menu(Scanner inputStr, Scanner inputInt, AccountDTO[] hnBank) {
		// 하나은행  서비스
		
		boolean subRun = true ; 
		while(subRun) {
			System.out.println("-----------------------");
			System.out.println("하나은행 메뉴로 진입합니다");
			System.out.println("-----------------------");
			System.out.println("1. 계좌 생성");
			System.out.println("2. 계좌 조회");
			System.out.println("3. 계좌 입출금");
			System.out.println("4. 계좌 이체");
			System.out.println("5. 계좌 삭제");
			System.out.print(">>>");
			String ans = inputInt.next();
			
			switch(ans) {
			case "1" : 
				System.out.println("▶▶▶ 신규 계좌 생성 ");
				createAccount(inputStr, inputInt, hnBank);
				break;
			case "2" : 
				System.out.println("▶▶▶ 계좌 목록 리스트 ");
				accountLists(inputStr,inputInt,hnBank);
				break;
			case "3" : 
				System.out.println("▶▶▶ 계좌 입출금 ");
				inoutput(inputStr,inputInt,hnBank);
				break;
			case "4" : 
				System.out.println("▶▶▶ 신규 계좌 생성 ");
				
				break;
			case "5" : 
				System.out.println("▶▶▶ 신규 계좌 생성 ");
				
				break;
				
			}
			
					
		}
		
		
	}

	private void inoutput(Scanner inputStr, Scanner inputInt, AccountDTO[] hnBank) {
		// 계좌입출금
		
		System.out.println("---------보통예금---------");
		System.out.println("1. 입금 || 2. 출금");
		System.out.print(">>>");
		int ans2 = inputInt.nextInt();
		switch (ans2) {
		case 1 : 
			System.out.println("입금 거래 메뉴입니다.");
		}
		
	}

	private void accountLists(Scanner inputStr, Scanner inputInt, AccountDTO[] hnBank) {
		// 계좌목록리스트
		System.out.println("----List를 출력합니다----");
		for (int i = 0; i<hnBank.length;i++) {
			AccountDTO accountList = hnBank[i];
			if(accountList != null) {
				System.out.print(accountList.getAno());
				System.out.print("\t");
				System.out.print(accountList.getOwner());
				System.out.print("\t");
				System.out.print(accountList.getBalance());
				System.out.print("\t\n");
				System.out.println("------------------------");
			}
		}
		
	}

	private void createAccount(Scanner inputStr, Scanner inputInt, AccountDTO[] hnBank) {
		// 신규계좌생성
		AccountDTO myAccount = new AccountDTO();
			
		myAccount.setBank("하나");
		System.out.println("계좌번호를 입력하세요");
		System.out.print("계좌번호 : ");
		myAccount.setAno(inputStr.next());
		System.out.println("계좌주의 이름를 입력하세요");
		System.out.print("계좌주 : ");
		myAccount.setOwner(inputStr.next());
		System.out.println("초기입금액을 입력하세요");
		System.out.print("초기입금액 : ");
		myAccount.setBalance(inputInt.nextInt());
		
		for(int i=0; i<hnBank.length;i++ ) {
			if(hnBank[i]==null) {
				hnBank [i] =  myAccount ; 
				System.out.println("결과 : " + myAccount); //결과는 투스트링
				break;				
			}//if
		}//for
		System.out.println(myAccount.getOwner() + "님의 계좌가 정상적으로 생성되었습니다.");
		
		
	}//생성메서드
	
	

}
