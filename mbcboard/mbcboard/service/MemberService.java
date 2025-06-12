package mbcboard.service;

import java.sql.SQLException;
import java.util.Scanner;

import mbcboard.dao.MemberDAO;
import mbcboard.dto.MemberDTO;

public class MemberService {
	//필드
	
	MemberDAO memberDAO = new MemberDAO();
	
	//생성자
	
	
	//메서드
	
	Scanner inputStr = new Scanner(System.in);
	
	public void subMem(Scanner inputStr) throws SQLException {
		
		boolean memRun = true;
		while (memRun) {
			System.out.println("========회원용 서비스 입니다=======");
			System.out.println("1. 전체 회원 보기");
			System.out.println("2. 회원가입 하기");
			System.out.println("3. 회원로그인하기");
			System.out.println("4. 회원정보 수정하기");
			System.out.println("5. 개인회원 자세히 보기");
			System.out.println("6. 회원 탈퇴 하기");
			System.out.println("7. 나가기");
			System.out.print(">>>");
			String memSelect = inputStr.next();
			
			switch (memSelect) {
			case "1" :
				System.out.println("전체 회원 보기");
				memberAll(memberDAO);
				break;
			case "2" :
				System.out.println("회원 가입 메서드 입니다.");
				insertMem(memberDAO,inputStr);
				break;
			case "3" :
				System.out.println("회원로그인하기");
				loginMem(memberDAO,inputStr);
				break;
			case "4" :
				System.out.println("회원 수정 메서드 입니다.");
				modifyMem(inputStr);
			case "5" :
				System.out.println("회원 정보확인 메서드 입니다.");
				readMem(inputStr);
				break;
			case "6" :
				System.out.println("회원 탈퇴 메서드 입니다.");
				deleteMem(inputStr);
				break;
			case "7" :
				System.out.println("회원용 서비스를 종료합니다.");
				memRun= false;
				break;
			default :
				System.out.println("1~7까지만 입력합니다.");
				break;
			}
		}//while
	}

	private void deleteMem(Scanner inputStr) throws SQLException {
		// id 확인 후 회원 삭제
		System.out.println("================================");
		System.out.println("===========[회원 삭제]===========");
		System.out.println("삭제할 회원의 아이디를 입력하세요");
		System.out.print(">>>");
		String id = inputStr.next();
		
		memberDAO.deleteMem(id,inputStr);
		
	}
	

	private void readMem(Scanner inputStr) throws SQLException {
		// 회원 id로 회원 찾아서 정보 확인
		System.out.println("================================");
		System.out.println("===========[회원 정보]===========");
		System.out.println("조회할 회원의 아이디를 입력하세요");
		System.out.print(">>>");
		String id = inputStr.next();
		
		memberDAO.readMem(id,inputStr);
		
		
	}

	private void modifyMem(Scanner inputStr) throws SQLException {
		// 회원id을 찾아서 pw수정하기
		System.out.println("============================");
		System.out.println("==========[회원 비밀번호 변경]============");
		System.out.println("변경할 회원의 아이디를 입력하세요");
		System.out.print(">>>");
		String id = inputStr.next();
		
		memberDAO.modifyMem(id,inputStr);
				
		
	}

	private void loginMem(MemberDAO memberDAO, Scanner inputStr) throws SQLException {
		// 회원 로그인
		
		MemberDTO memberDTO = new MemberDTO();
		
		System.out.println("===========================");
		System.out.println("===========[로그인]============");
		System.out.println("★★로그인 아이디를 입력하세요");
		System.out.print(">>> id : ");
		memberDTO.setId(inputStr.next());
		
		System.out.println("★★비밀번호를 입력하세요");
		System.out.print(">>> pw : ");
		memberDTO.setPw(inputStr.next());
		
		memberDAO.loginMem(memberDTO);
		System.out.println("=========================");
		
		
	}

	private void insertMem(MemberDAO memberDAO, Scanner inputStr) throws SQLException {
		// 회원가입 dto 게터세터 사용
		
		MemberDTO memberDTO = new MemberDTO();
		
		System.out.println("=======================");
		System.out.println("=========회원가입========");
		System.out.print("◎이름 : ");
		memberDTO.setBwriter(inputStr.next());
		
		System.out.print("◎아이디 : ");
		memberDTO.setId(inputStr.next());
		
		System.out.print("◎비밀번호 : ");
		memberDTO.setPw(inputStr.next());
		
		memberDAO.insertMem(memberDTO); // dao에 위의 객체 넣기
		
		System.out.println("회원 가입이 완료 되었습니다.");
		System.out.println("=======================");
	}

	private void memberAll(MemberDAO memberDAO) throws SQLException {
		// 전체 회원보기
		
		System.out.println("=======================");
		System.out.println("=====전체 회원목록입니다=====");
		memberDAO.memberAll();
		System.out.println("=======================");
		
	}
	

}
