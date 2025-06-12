package mbcjdbc.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpDAO {
	// jdbc 담당 클래스
	// jdbc는 이미 만들어진 외부 라이브러리로 5단계 설정이 필수.
	// 1단계 : 연결하는 객체 connection
	// 2단계 : 쿼리문을 생성하는 객체 Statement(구형,정적쿼리) / PreparedStatement(신형,동적쿼리)
	// 3단계 : 쿼리문 실행
	// 4단계 : 실행결과를 받음 select(resultset) / 나머지는 int(정수 1,0)
	// 5단계 : 연결을 종료

	// 필드

	// 기본 생성자(생략시 기본으로 만듬)

	// 메서드

	public void inserEMP(String name, String dept, double score) throws SQLException {
		// 3개의 값을 전달 받아서 EMP테이블로 전달.

		Connection conn = null;
		Statement stmt = null; // 쿼리문 구형 저장객체
		PreparedStatement pstmt = null; // 쿼리문 신형 저장객체
		ResultSet resultSet = null; // 쿼리 실행결과를 표로 출력
		int result = 0; // 실행결과 정수로 출력

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");// 1단계 ojdbc6.jar 호출
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "jdbctest", "jdbctest");

			stmt = conn.createStatement(); // 쿼리처리용

			String sql = "insert into emp(num, name, dept, score)" + "values(emp_seq.nextval,'" + name + "','" + dept
					+ "','" + score + "')"; // 쿼리문 완성
			result = stmt.executeUpdate(sql);

			if (result > 0) {
				System.out.println(result + "행의 데이터를 추가했습니다\n");
				conn.commit();
			} else {
				System.out.println("결과 : " + result + "입니다");
				System.out.println("입력 실패 롤백 됩니다.");
				conn.rollback();
			}

		} catch (ClassNotFoundException e) { // ojdbc6.jar, forName
			System.out.println("ojdbc6.jar가 없거나 forName에 문자열이 잘못되었습니다.");
			// e.printStackTrace();

		} catch (SQLException e) { // url, id, pw 예외처리
			System.out.println("URL이나 ID, PW, 쿼리문을 확인 해주세요");
			// e.printStackTrace(); //자바에서 제공하는 오류메세지 빨간글씨들 //원하지않으면 주석처리가능

		} finally {
			// 성공이든 실패든 무조건 마지막에 실행되는문
			stmt.close();
			System.out.println("스테이트문 종료");
			conn.close();
			System.out.println("conn문 종료");

		}

	} // insertEMP 메서드 종료

	public void selectEMPALL() throws SQLException {
		// TODO Auto-generated method stub

		Connection conn = null;
		Statement stmt = null; // 쿼리문 구형 저장객체
		PreparedStatement pstmt = null; // 쿼리문 신형 저장객체
		ResultSet resultSet = null; // 쿼리 실행결과를 표로 출력
		int result = 0; // 실행결과 정수로 출력

		try {
			// 오류발생 가능성 잇는 실행문
			Class.forName("oracle.jdbc.driver.OracleDriver");// 1단계 ojdbc6.jar 호출
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "jdbctest", "jdbctest");

			stmt = conn.createStatement(); // 쿼리처리용

			String sql = "SELECT * FROM EMP ORDER BY NUM ASC"; // NUM 오름차순
			resultSet = stmt.executeQuery(sql);

			System.out.println("================================");
			System.out.println("사원번호\t 이름\t 부서\t 입사점수");
			System.out.println("================================");

			while (resultSet.next()) { // 받은 결과를 표내용으로 출력.
				System.out.print(resultSet.getInt("num") + "\t");
				System.out.print(resultSet.getString("name") + "\t");
				System.out.print(resultSet.getString("dept") + "\t");
				System.out.println(resultSet.getDouble("score") + "\t");
			}
		} catch (ClassNotFoundException e) { // ojdbc6.jar, forName
			System.out.println("ojdbc6.jar가 없거나 forName에 문자열이 잘못되었습니다.");
			// e.printStackTrace();

		} catch (SQLException e) { // url, id, pw 예외처리
			System.out.println("URL이나 ID, PW, 쿼리문을 확인 해주세요");
			// e.printStackTrace(); //자바에서 제공하는 오류메세지 빨간글씨들 //원하지않으면 주석처리가능

		} finally {
			// 성공이든 실패든 무조건 마지막에 실행되는문
			resultSet.close();
			System.out.println("resultSet 종료");
			stmt.close();
			System.out.println("스테이트문 종료");
			conn.close();
			System.out.println("conn문 종료");
		}
	}//selectEMPALL 메서드 종료

	public void searchEMP(String searchName) throws SQLException {
		// TODO Auto-generated method stub
		
		Connection conn = null;
		Statement stmt = null; // 쿼리문 구형 저장객체
		PreparedStatement pstmt = null; // 쿼리문 신형 저장객체
		ResultSet resultSet = null; // 쿼리 실행결과를 표로 출력
		int result = 0; // 실행결과 정수로 출력
		
		try {
			// 오류발생 가능성 잇는 실행문
			Class.forName("oracle.jdbc.driver.OracleDriver");// 1단계 ojdbc6.jar 호출
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "jdbctest", "jdbctest");

			stmt = conn.createStatement(); // 쿼리처리용

			String sql = "SELECT * FROM EMP where name = '"+ searchName+"'"; // NUM 오름차순
			System.out.println("입력된 쿼리문 : " +sql);
			resultSet = stmt.executeQuery(sql);
			
			System.out.println("================================");
			System.out.println("사원번호\t 이름\t 부서\t 입사점수");
			System.out.println("================================");

			while (resultSet.next()) { // 받은 결과를 표내용으로 출력.
				System.out.print(resultSet.getInt("num") + "\t");
				System.out.print(resultSet.getString("name") + "\t");
				System.out.print(resultSet.getString("dept") + "\t");
				System.out.println(resultSet.getDouble("score") + "\t");
			}
		}catch (ClassNotFoundException e) { // ojdbc6.jar, forName
			System.out.println("ojdbc6.jar가 없거나 forName에 문자열이 잘못되었습니다.");
			// e.printStackTrace();

		} catch (SQLException e) { // url, id, pw 예외처리
			System.out.println("URL이나 ID, PW, 쿼리문을 확인 해주세요");
			// e.printStackTrace(); //자바에서 제공하는 오류메세지 빨간글씨들 //원하지않으면 주석처리가능

		} finally {
			// 성공이든 실패든 무조건 마지막에 실행되는문
			resultSet.close();
			System.out.println("resultSet 종료");
			stmt.close();
			System.out.println("스테이트문 종료");
			conn.close();
			System.out.println("conn문 종료");
	}
} //searchEMP 메서드 종료
}
