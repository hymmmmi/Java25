package textexam.exam01;

import java.util.Scanner;

import ch06.extended.lineage.DTO.Account;
import textexam.exam01.DTO.Grade;
import textexam.exam01.DTO.LoginDTO;
import textexam.exam01.service.LoginService;

public class GradeExam {

	public static Scanner inputInt = new Scanner(System.in);
	public static Scanner inputStr = new Scanner(System.in);
	
	static LoginDTO[] loginDTO = new LoginDTO[0];
	static Grade[] grade = new Grade[0];
	
static {
		
		LoginDTO loginDTO = new LoginDTO();// 로그인 기본 생성자
}
	
	public static void main(String[] args) {
		// 성적 처리 프로그램 
				
		boolean run = true ;
		
		while(run) {
			System.out.println("===========성적 처리 프로그램==========");
			System.out.println("1. 로그인 | 2. 성적 관리 | 3. 종료");
			System.out.print(">>>");
			int ans = inputInt.nextInt();
			
			switch(ans) {					
			case 1 : 
				System.out.println("------로그인 메뉴입니다------");
				LoginService loginService = new LoginService();
				loginService.menu(inputStr, loginDTO, null);
				break;
			case 2 : 
				System.out.println("------성적 관리 메뉴입니다------");
				GradeService gradeService = new GradeService();
				gradeService.menu(null, ans, ans, ans);
				break;
			case 3 : 
				System.out.println("------메뉴를 종료합니다.------");
				run= false ;
				break;
				
				default : 
					System.out.println("1~3 까지만 입력하세요");
					break;
				
			
			}
		}
	
}

}
