package ch04.kr.co.mbc.game;

import java.util.Scanner;

import ch04.Member;
import ch04.kr.co.mbc.game.dto.CartDTO;
import ch04.kr.co.mbc.game.dto.CharacterDTO;
import ch04.kr.co.mbc.game.dto.GliderDTO;
import ch04.kr.co.mbc.game.dto.ItemDTO;
import ch04.kr.co.mbc.game.dto.MemberDTO;
import ch04.kr.co.mbc.game.dto.TireDTO;
import ch04.kr.co.mbc.game.service.MemberSV;

public class MarioKartExam {
	//필드
	
	public static Scanner input = new Scanner(System.in); // 키보드입력
	public static MemberDTO[] memberDTOs = new MemberDTO[10];
	//회원 10명 배열
	public static CharacterDTO[] characterDTOs = new CharacterDTO[15];
	//캐릭터 15개 배열
	public static CartDTO[] cartDTOs = new CartDTO[8];
	//카드 배열
	public static GliderDTO[] gliderDTOs = new GliderDTO[8];
	//글라이더 배열
	public static TireDTO[] tireDTOs = new TireDTO[8];
	//타이어 배열
	public static ItemDTO[] itemDTOs = new ItemDTO[8];
	//아이템 배열
	
	public static MemberDTO loginState ; // 로그인 상태 유지 (session)
	
	// 생성자
	
	static {
		
		CharacterDTO characterDTO0 = new CharacterDTO("마리오", 3.0, 4.5, 3.7, 4.1, 3.8);
		CharacterDTO characterDTO1 = new CharacterDTO("루이지", 3.2, 4.4, 3.1, 4.4, 3.2);
		CharacterDTO characterDTO2 = new CharacterDTO("와리오", 3.4, 4.2, 3.2, 4.2, 3.4);
		CharacterDTO characterDTO3 = new CharacterDTO("피치", 3.1, 4.8, 3.4, 4.5, 3.5);
		
		characterDTOs[0] = characterDTO0 ;
		characterDTOs[1] = characterDTO1 ;
		characterDTOs[2] = characterDTO2 ;
		characterDTOs[3] = characterDTO3 ;
		
	}// 스테틱 블럭 
	
	//메서드

	public static void main(String[] args) {
		
		System.out.println("=========마리오 카트 게임을 시작합니다===========");
		
		boolean run = true ; 
		while(run) {
			
			System.out.println("1. 회원관리 | 2. 카트관리 | 3. 게임실행 | 4. 종료");
			System.out.print(">>>>");
			String select = input.next();
			
			switch(select) {
			case "1" :
				System.out.println("회원관리 클래스로 진입합니다.");
				MemberSV memberSV = new MemberSV();
				
				loginState = memberSV.menu(input, memberDTOs, loginState) ;
				break;
				
			case "2" : 
				System.out.println("카트관리 클래스로 진입합니다.");
				break ;
				
			case "3" : 
				System.out.println("게임실행 클래스로 진입합니다.");
				break ;
			case "4" : 
				System.out.println("게임 종료를 진행합니다.");
				break ;
				
				default : 
					System.out.println("1~4번 숫자만 입력하세요.");
					
			}//switch
		}//while
		

	}//main

}//class
