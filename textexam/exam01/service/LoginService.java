package textexam.exam01.service;

import java.io.InputStream;
import java.util.Scanner;

import ch06.extended.lineage.DTO.Account;
import textexam.exam01.DTO.LoginDTO;

public class LoginService {
	Scanner inputStr = new Scanner(System.in);

	LoginDTO logindto = new LoginDTO();

	public void menu(Scanner inputStr, LoginDTO[] loginDTOs, LoginDTO loginAccount) {
		System.out.println("로그인 할 id를 입력하세요 ");
		System.out.print(">>>");
		logindto.setId(inputStr.next());
		System.out.println("로그인 할 pw를 입력하세요 ");
		System.out.print(">>>");
		logindto.setPw(inputStr.next());

		for (int i = 0; i < loginDTOs.length; i++) {

			if (loginDTOs[i].getId().equals(logindto.getId()) && loginDTOs[i].getPw().equals(logindto.getPw())) {
				System.out.println("로그인 되었습니다.");
				System.out.println("안녕하세요.");
				break;

			} else if (loginDTOs[i].getId().equals(logindto.getId()) || loginDTOs[i].getPw().equals(logindto.getPw())) {
				System.out.println("로그인에 실패하였습니다. ");
				System.out.println("초기 메뉴로 돌아갑니다.");
			}

		}
	}

}