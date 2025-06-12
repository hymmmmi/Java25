package mbcboard.service;

import java.sql.SQLException;
import java.util.Scanner;

import mbcboard.dao.BoardDAO;
import mbcboard.dto.BoardDTO;

public class BoardService {
	// dao와 dto를 사용하여 처리한다

	// 필드
	public BoardDAO boardDAO = new BoardDAO();

	// 생성자

	// 메서드
	public void subMenu(Scanner inputStr) throws SQLException {

		boolean subRun = true;

		while (subRun) {
			System.out.println("MBC아카데미 게시판 서비스 입니다.");
			System.out.println("1. 모두보기");
			System.out.println("2. 게시글 작성");
			System.out.println("3. 게시글 자세히 보기");
			System.out.println("4. 게시글 수정");
			System.out.println("5. 게시글 삭제");
			System.out.println("6. 나가기");
			System.out.print(">>>");
			String subSelect = inputStr.next();

			switch (subSelect) {
			case "1":
				System.out.println("모든 게시글 보기");
				selectAll(boardDAO); // dao에 전제보기 메서드 제공
				break;
			case "2": 
				System.out.println("게시글 작성 하기");
				insertBoard(boardDAO, inputStr);
				break;
			case "3":
				System.out.println("게시글 자세히 보기");
				readOne(inputStr);
				break;
			case "4":
				System.out.println("게시글 수정 하기");
				modify(inputStr);
				break;
			case "5":
				System.out.println("게시글 삭제하기");
				deleteOne();
				break;
			case "6":
				System.out.println("게시글 보기종료");
				subRun = false ; 			
				break;
			}//switch
		} // while

	}

	private void deleteOne() throws SQLException {
		// TODO Auto-generated method stub
		System.out.println("삭제하려는 게시글의 번호를 입력하세요");
		Scanner inputInt = new Scanner(System.in);
		System.out.print(">>>");
		int selectBno = inputInt.nextInt();
		
		boardDAO.deleteOne(selectBno);
	}

	private void modify(Scanner inputStr) throws SQLException {
		// 제목 찾아서 수정 select
		
		System.out.println("수정하려는 게시글의 제목을 입력하세요");
		System.out.print(">>>");
		String title = inputStr.next();
		
		boardDAO.modify(title,inputStr); // 선택한 제목과 입력하는 값 가져오기
		System.out.println("==========끝==========");
		
	}

	private void readOne(Scanner inputStr) throws SQLException {
		// 전체내용가져오기가 아니라 키보드로 입력하면 내용을 볼 수있게 처리
		// select로 만들기

		System.out.println("보고싶은 게시글의 제목을 입력하세요");
		System.out.print(">>>");
		String title = inputStr.next();

		boardDAO.readOne(title); // 제목가져오기
		System.out.println("==========끝==========");

	}

	private void insertBoard(BoardDAO boardDAO, Scanner inputStr) throws SQLException {
		// 입력한 데이터를 dto를 사용하여 db에 insert
		BoardDTO boardDTO = new BoardDTO();// 빈객체
		System.out.print("작성자 : ");
		boardDTO.setBwriter(inputStr.next());// 키보드로 입력해서 dto에 넣음
		System.out.print("제목 : ");
		boardDTO.setBtitle(inputStr.next());

		Scanner inputLine = new Scanner(System.in);
		System.out.print("내용 : ");
		boardDTO.setBcontent(inputLine.nextLine()); // 띄어쓰기가 잇는 문자열로

		boardDAO.insertBoard(boardDTO); // 위에만든 객체의 값을 dao에 전달
		System.out.println("==============종료================");

	}

	private void selectAll(BoardDAO boardDAO) throws SQLException {
		// dao에게 전체보기 서비스 제공
		System.out.println("======================");
		System.out.println("====MBC게시판목록입니다====");
		boardDAO.selectAll();
		System.out.println("======================");

	}
}
