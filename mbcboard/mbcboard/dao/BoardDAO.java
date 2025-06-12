package mbcboard.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import mbcboard.dto.BoardDTO;
import mbcboard.dto.MemberDTO;

public class BoardDAO {
	// DB와의 연동을 담당

	// 필드
	public BoardDTO boardDTO = new BoardDTO();
	public Connection connection = null; // 1단계
	public Statement statement = null; // 3단계 (변수 직접처리 '"+ name +"')
	public PreparedStatement preparedStatement = null; // 3단계 >?(인파라미터)
	public ResultSet resultSet = null; // 4단계 표로 결과 executeQuery
	public int result = 0; // 4단계 정수로 결과 executeUpdate

	// 생성자 기본생성자

	public BoardDAO() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 1단계 jar 호출
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "boardtest", "boardtest"); // 2단계
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 이름이나, ojdbc6.jar 파일이 잘못 되었습니다.");
			e.printStackTrace();
			System.exit(0); // 강제 종료
		} catch (SQLException e) {
			System.out.println("url, id, pw가 잘못 되었습니다. BoardDAO에 기본생성자를 확인하세요");
			e.printStackTrace();
			System.exit(0); // 강제 종료
		}

	}

	public void selectAll() throws SQLException {
		// sql사용하여 전체보기 목록 결과 출력

		try {
			String sql = "select bno, btitle, bwriter, bdate from board order by bdate desc";
			// 번호, 제목, 작성자, 날짜를 날짜 내림차순으로 db에서 내용을 가져오는 쿼리문
			statement = connection.createStatement(); // 쿼리문 실행객체
			resultSet = statement.executeQuery(sql); // 결과를 표로 받음 (resultSet)

			System.out.println("번호\t 제목\t 작성자\t 작성일\t");
			while (resultSet.next()) {
				System.out.print(resultSet.getInt("bno") + "\t");
				System.out.print(resultSet.getString("btitle") + "\t");
				System.out.print(resultSet.getString("bwriter") + "\t");
				System.out.println(resultSet.getDate("bdate") + "\t");
			}
			System.out.println("================끝=================");
		} catch (SQLException e) {
			// 예외처리문
			System.out.println("selectAll() 메서드에 쿼리문이 잘못 되었습니다");
			e.printStackTrace();
		} finally {
			resultSet.close();
			statement.close();
		}

	}

	public void insertBoard(BoardDTO boardDTO) throws SQLException {
		//
		

		try {
			String sql = "insert into board(bno, btitle, bcontent, bwriter, bdate)"
					+ "values(board_seq.nextval,?,?,?,sysdate)";
			preparedStatement = connection.prepareStatement(sql); // 객체생성
			preparedStatement.setString(1, boardDTO.getBtitle()); // 첫번째 ?에 dto 제목
			preparedStatement.setString(2, boardDTO.getBcontent()); // 두번째 ?에 dto 내용
			preparedStatement.setString(3, boardDTO.getBwriter()); // 세번째 ?에 dto 작성자
			System.out.println("쿼리 확인 : " + sql); // 완성본 확인

			result = preparedStatement.executeUpdate(); // 결과값 정수로 받음

			if (result > 0) { // true
				System.out.println(result + "개의 게시물이 등록되었습니다");
				connection.commit();
			} else {
				System.out.println("쿼리 실행 결과 : " + result);
				System.out.println("입력실패 !!!");
				connection.rollback();
			}

		} catch (SQLException e) {
			// 예외발생
			System.out.println("insertBoard()메서드의 쿼리문을 확인하세요");
			e.printStackTrace();
		} finally {
			preparedStatement.close();
		}

	}

	public void readOne(String title) throws SQLException {
		// service에서 입력된 제목 문자열을 dao에서 select하여 출력

		try {
			String sql = "select bno, btitle, bcontent, bwriter, bdate from board where btitle =?";
			preparedStatement = connection.prepareStatement(sql); // 객체생성
			preparedStatement.setString(1, title); // service에서 입력한 제목이 첫번째 ? 로 들어감
			resultSet = preparedStatement.executeQuery(); // 결과값 표로 출력

			if (resultSet.next()) {
				BoardDTO boardDTO = new BoardDTO(); // 빈객체

				boardDTO.setBno(resultSet.getInt("bno"));
				boardDTO.setBtitle(resultSet.getString("btitle"));
				;
				boardDTO.setBcontent(resultSet.getString("bcontent"));
				boardDTO.setBwriter(resultSet.getString("bwriter"));
				boardDTO.setBdate(resultSet.getDate("bdate"));
				// 데이터 베이스에 있는 행을 객체에 넣기 완료

				System.out.println("=========================");
				System.out.println("번호 : " + boardDTO.getBno());
				System.out.println("제목 : " + boardDTO.getBtitle());
				System.out.println("내용 : " + boardDTO.getBcontent());
				System.out.println("작성자 : " + boardDTO.getBwriter());
				System.out.println("작성일 : " + boardDTO.getBdate());

			} else {
				System.out.println("해당하는 게시물이 존재하지 않습니다.");

			} // if문 종료

		} catch (SQLException e) {
			System.out.println("예외 발생 : readOne()메서드를 확인하세요");
			e.printStackTrace();
		} finally {
			resultSet.close();
			preparedStatement.close();

		}
	}

	public void modify(String title, Scanner inputStr) throws SQLException {
		// 제목 찾아서 수정하기

		BoardDTO boardDTO = new BoardDTO();

		System.out.println("[수정할 내용을 입력하세요]");
		System.out.print("제목 : ");
		boardDTO.setBtitle(inputStr.next());

		Scanner inputLine = new Scanner(System.in);
		System.out.println("내용 : ");
		boardDTO.setBcontent(inputLine.nextLine());

		try {
			String sql = "update board set btitle = ? , bcontent = ?, bdate = sysdate where btitle = ?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, boardDTO.getBtitle()); // 수정값
			preparedStatement.setString(2, boardDTO.getBcontent()); // 수정값
			preparedStatement.setString(3, title); // 수정 전 기존의 제목

			result = preparedStatement.executeUpdate();

			if (result > 0) { // true
				System.out.println(result + "개의 게시물이 수정되었습니다");
				connection.commit();
			} else {
				System.out.println("수정이 되지 않았습니다.");
				connection.rollback();
			}

		} catch (SQLException e) {
			System.out.println("예외 발생 : modify()메서드를 sql문을 확인하세요");
			e.printStackTrace();
		} finally {
			preparedStatement.close();

		}
	}

	public void deleteOne(int selectBno) throws SQLException {
		// 
		
		try {
			String sql = "delete from board where bno = ?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, selectBno);
			
			result = preparedStatement.executeUpdate();
			
			if (result > 0) { // true
				System.out.println(result + "개의 게시물이 삭제되었습니다");
				connection.commit();
			} else {
				System.out.println("게시물이 삭제 되지 않았습니다.");
				connection.rollback();
			}
		} catch (SQLException e) {
			System.out.println("예외 발생 : deleteOne()메서드를 sql문을 확인하세요");
			e.printStackTrace();
		} finally {
			preparedStatement.close();

		}
	}


	// 메서드

}
