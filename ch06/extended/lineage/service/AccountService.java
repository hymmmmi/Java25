package ch06.extended.lineage.service;

import java.util.Scanner;

import ch06.extended.lineage.DTO.Account;

public class AccountService {
	// 계정 로그인에 대한 부메뉴 서비스

	Account account = new Account();

	public void menu(Scanner inputStr, Account[] accounts, Account loginAccount) {
		System.out.println("1. 로그인 | 2. 회원가입 | 3. 회원수정 | 4. 나가기");
		System.out.print(">>>");
		String select = inputStr.next();

		switch (select) {
		case "1":
			System.out.println("로그인을 시작합니다.");
			System.out.print("id : ");
			account.setId(inputStr.next());
			System.out.print("pw : ");
			account.setPw(inputStr.next());
			

			for (int i = 0; i < accounts.length; i++) {
				if (accounts[i] != null) {
					if (accounts[i].getId().equals(account.getId())) {
						System.out.println("등록된 id가 있습니다.");
						if (accounts[i].getPw().equals(account.getPw())) {
							System.out.println("등록된 pw가 있습니다.");
							loginAccount = accounts[i];

							System.out.println("로그인 성공");
							break;
						} else {
							System.out.println("등록된 id가 없습니다.");
							System.out.println("등록된 id가 없습니다.");
							System.out.println("해당하는 정보가 없습니다.");
							break;

						} 
					}// 아이디비번확인if

				} // 배열 if

			} // for

		}//switch
	
		
	}
}
