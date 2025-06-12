package ch06.extended.lineage;

import java.util.Scanner;

import ch06.extended.lineage.DTO.Account;
import ch06.extended.lineage.DTO.ElfDTO;
import ch06.extended.lineage.DTO.KnightDTO;
import ch06.extended.lineage.service.AccountService;

public class LineageExam {
	//필드
	public static Scanner inputStr = new Scanner(System.in);
	public static Scanner inputInt = new Scanner(System.in);

	public static Account[] accounts = new Account[10]; //계정 10개 배열
	
	public static Account loginAccount;
	public static KnightDTO knightDTO = new KnightDTO();
	public static ElfDTO elfDTO = new ElfDTO();
	
	//생성자
	static {
		knightDTO.setSword("양손검");
		knightDTO.setArmor("징박힌갑옷");
		knightDTO.setShield("방패");
		knightDTO.setName("기사");
		knightDTO.setSex("남");
		knightDTO.setLevel("1");
		knightDTO.setHp(5000);
		knightDTO.setMp(50);
		knightDTO.setMoney(500000);
		
		elfDTO.setBow("양손활");
		elfDTO.setDress("천사드레스");
		elfDTO.setArrow("크리티컬화살");
		elfDTO.setName("저요정");
		elfDTO.setSex("여");
		elfDTO.setLevel("1");
		elfDTO.setHp(3000);
		elfDTO.setMp(2000);
		elfDTO.setMoney(10000000);
		
		Account account = new Account();
		account.setId("kkk");
		account.setPw("abc");
		account.setNickName("ㅎㅇㅎㅇ");
		accounts[0] = account;
		
	}

	
	public static void main(String[] args) {
		// 메인
		
		System.out.println("=====리니지 게임을 시작합니다=====");
		boolean run = true ;
		while(run) {
			
			System.out.println("1. 로그인 | 2. 캐릭터 선택 | 3. 게임 실행 | 4. 종료");
			System.out.print(">>>");
			String select = inputStr.next();
			
			switch(select) {
			case "1" : 
				System.out.println("로그인을 시작합니다.");
				AccountService accountService = new AccountService();
				accountService.menu(inputStr, accounts, loginAccount);
				break;
				
			case "2" : 
				System.out.println("캐릭터를 선택합니다.");
				break;
				
			case "3" : 
				System.out.println("게임을 시작합니다.");
				break;
				
			case "4" : 
				System.out.println("게임을 종료합니다.");
				run = false ;
				break;
				
			default: 
				System.out.println("1~4 까지만 입력하세요.");
				break;
				
			}
		}
	
		
	}

}
