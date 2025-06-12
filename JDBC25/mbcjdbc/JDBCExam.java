package mbcjdbc;

import java.sql.SQLException;
import java.util.Scanner;

import mbcjdbc.DAO.EmpDAO;

public class JDBCExam {

	public static void main(String[] args) throws SQLException {
		// 프로젝트 우클릭 빌드패스-> 컨피그 빌드 패스에 -> 외부 라이브러리 추가 필수 ojdbc6.jar
		// Referenced Libraries가 추가된다. > ojdbc6.jar를 import 할 수 있다.
		// throws SQLException sql 런타임 중에 오류나 버그로 중단되는 것을 처리함
	    // 맨위에 import java.sql.SQLException; 확인
		
		//DTO > 객체용, 게터/세터
		//DAO > 데이터베이스에 접속하여 CRUD 쿼리 처리용
		//service > 자바에서 crud부메뉴용
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("사원 이름 : ");
		String name = input.next();
		
		System.out.print("부서명 : ");
		String dept = input.next();
		
		System.out.print("입사 점수 : ");
		double score = input.nextDouble();
		
		// 객체 생성하여 DAO에게 전달 해야함
		
		EmpDAO empDAO = new EmpDAO(); // DAO객체
		//생성 > DAO메서드 호출
		empDAO.inserEMP(name, dept, score);
		
		System.out.println("모든 데이터 확인해보기");
		empDAO.selectEMPALL(); // DAO에 selectEMPALL메서드 생성
		
		System.out.println("검색하고 싶은 이름을 입력하세요");
		System.out.print(">>>");
		String searchName = input.next();
		empDAO.searchEMP(searchName); // DAO에 searchEMP메서드 생성


	}

}
