package mbcboard.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

import mbcboard.BoardExam;
import mbcboard.dto.MemberDTO;

public class MemberDAO {
	//db연동과 5단계
	//필드
	public MemberDTO memberDTO = new MemberDTO();
	public Connection connection = null;
	public Statement statement = null;
	public PreparedStatement preparedStatement = null;
	public ResultSet resultSet = null;
	public int result = 0;
	
	
	//생성자
	public MemberDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); //1단계 jar 연결 호출
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "boardtest", "boardtest"); //2단계 conn
			
		} catch (ClassNotFoundException e) {
			//예외발생
			System.out.println("드라이버 이름이나, ojdbc6.jar파일이 잘못되었습니다");
			e.printStackTrace();
			System.exit(0);
		} catch (SQLException e) {
			System.out.println("url, id, pw가 잘못되었습니다.");
			e.printStackTrace();
			System.exit(0);
		}
		
	}


	public void memberAll() throws SQLException {
		// 
		try {
			String sql = "select mno, bwriter, id, regidate from member order by regidate desc";
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);
			
			System.out.println("회원번호\t, 회원이름\t, 회원아이디\t, 등록일\t");
			
			while (resultSet.next()) {
				System.out.print(resultSet.getInt("mno")+"\t");
				System.out.print(resultSet.getString("bwriter")+"\t");
				System.out.print(resultSet.getString("id")+"\t");
				System.out.println(resultSet.getDate("regidate")+"\t");
			}

			System.out.println("================끝=================");
			
		} catch (SQLException e) {
			System.out.println("memberAll() 메서드 쿼리문이 잘못되었습니다.");
			e.printStackTrace();
		}finally {
			resultSet.close();
			statement.close();
			
		}
		
		
	}


	public void insertMem(MemberDTO memberDTO) throws SQLException {
		// 신형 쿼리문 ?을 사용하여 세터로 입력하고 등록한 회원 조회
		
		try {
			String sql = "insert into member(mno, bwriter, id, pw, regidate)"
					+ "values(board_seq.nextval,?,?,?,sysdate)";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, memberDTO.getBwriter());
			preparedStatement.setString(2, memberDTO.getId());
			preparedStatement.setString(3, memberDTO.getPw());
			
			result = preparedStatement.executeUpdate();
			
			if(result>0) {
				System.out.println("=======등록된 정보=======");
				System.out.print("이름 : " + memberDTO.getBwriter()+"\t");
				System.out.print("id : " + memberDTO.getId()+"\t");
				System.out.println("pw : " + memberDTO.getPw()+"\t");
				System.out.println(result + " 명의 회원이 등록 되었습니다");
				connection.commit();
			}else {
				System.out.println("회원가입이 실패 하였습니다.");
				connection.rollback();
			}
			
						
		} catch (SQLException e) {
			System.out.println("insertmemAll() 메서드 쿼리문이 잘못되었습니다.");
			e.printStackTrace();
		}finally {
			preparedStatement.close();
			
		}
		
		
	}


	public void loginMem(MemberDTO memberDTO) throws SQLException {
		// 
		try {
			String sql = "select id, pw from member where id =? and pw =?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, memberDTO.getId());
			preparedStatement.setString(2, memberDTO.getPw());
			result = preparedStatement.executeUpdate();
			
			if(result>0) {
				System.out.println("로그인이 되었습니다.");
				System.out.println(memberDTO.getId() + "님 안녕하세요.");
				connection.commit();
				BoardExam.session = memberDTO;

								
			}else {
				System.out.println("로그인 실패!!");
				connection.rollback();
			}
			
			
		}catch (SQLException e) {
			System.out.println("insertmemAll() 메서드 쿼리문이 잘못되었습니다.");
			e.printStackTrace();
		}finally {
			preparedStatement.close();
			
		}
		
		
	}


	public void modifyMem(String id, Scanner inputStr) throws SQLException {
		// 회원 id를 찾아서 pw를 변경.
		MemberDTO memberDTO = new MemberDTO();
				
		System.out.println("변경하는 비밀번호를 입력하세요");
		System.out.print(">>> new pw : ");
		memberDTO.setPw(inputStr.next());
		
		try {
			String sql = "update member set pw = ? where id=?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, memberDTO.getPw());
			preparedStatement.setString(2, id);
			
			result = preparedStatement.executeUpdate();
			
			if(result>0) {
				System.out.println("비밀번호가 변경되었습니다.");
				connection.commit();
			}else { 
				System.out.println("변경 실패!");
				connection.rollback();
			}
			
			
		} catch (SQLException e) {
			System.out.println("modify() 메서드 쿼리문이 잘못되었습니다.");
			e.printStackTrace();
		}finally {
			preparedStatement.close();
			
		}
		
		
	}	

	public void readMem(String id, Scanner inputStr) throws SQLException {
		// 
		
		try {
			String sql = "select mno, bwriter, id, pw, regidate from member where id=?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, id);
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				MemberDTO memberDTO = new MemberDTO();
				
				memberDTO.setMno(resultSet.getInt("mno"));
				memberDTO.setBwriter(resultSet.getString("bwriter"));
				memberDTO.setId(resultSet.getString("id"));
				memberDTO.setPw(resultSet.getString("pw"));
				memberDTO.setRegidate(resultSet.getDate("regidate"));
				
				System.out.println("▶ 조회된 회원");
				System.out.println("회원번호 : " + memberDTO.getMno());
				System.out.println("회원이름 : " + memberDTO.getBwriter());
				System.out.println("회원id : " + memberDTO.getId());
				System.out.println("회원pw : " + memberDTO.getPw());
				System.out.println("회원등록 날짜 : " + memberDTO.getRegidate());
				
			}else {
				System.out.println("존재 하지않는 회원입니다.");
			}
			
			
		} catch (SQLException e) {
			System.out.println("readMem() 메서드 쿼리문이 잘못되었습니다.");
			e.printStackTrace();
		}finally {
			resultSet.close();
			preparedStatement.close();
		}
			
				
	}
	// 메서드


	public void deleteMem(String id, Scanner inputStr) throws SQLException {
		// 회원 id 확인 후 회원 삭제
		
		try {
			String sql = "delete from member where id=?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, id);
			result = preparedStatement.executeUpdate();
			
			if(result>0) {

				System.out.println("탈퇴가 완료되었습니다");
				System.out.println();

			}else {
				System.out.println("존재 하지않는 회원입니다.");
				System.out.println("회원을 다시 확인해주세요.");
			}
			
			
			
		} catch (SQLException e) {
			System.out.println("delete() 메서드의 쿼리문이 잘못되었습니다 ");
			e.printStackTrace();
		}finally {
			preparedStatement.close();
		}
		
	}
}
