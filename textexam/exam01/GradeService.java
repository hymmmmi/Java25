package textexam.exam01;

import java.util.Scanner;

import textexam.exam01.DTO.Grade;

public class GradeService {

	Scanner inputInt = new Scanner(System.in);
	Scanner inputStr = new Scanner(System.in);

	Grade grade = new Grade();

	public void menu(String name, int kor, int math, int total) {

		boolean run = true;
		while (run) {
			System.out.println("1. 성적 등록 | 2. 성적 조회 | 3. 종료");
			System.out.print(">>>");
			int select = inputInt.nextInt();

			switch (select) {

			case 1:
				System.out.println("▶ 등록할 학생 수를 입력하세요.");
				System.out.print(">>>");
				int count = inputInt.nextInt();
				System.out.println(count + "명의 학생 성적을 등록합니다.");

				String[] names = new String[count];

				for (int i = 0; i < names.length; i++) {
					System.out.print("이름 : ");
					grade.setName(inputStr.next());
					System.out.print("국어점수 : ");
					grade.setKor(inputInt.nextInt());
					System.out.print("수학점수 : ");
					grade.setMath(inputInt.nextInt());
				}
				System.out.println("-----------성적 입력 완료되었습니다.-------------");
				break;

			case 2:
				System.out.println("▶ 학생들의 성적을 조회합니다.");
				// for (int i = 0; i < allstus.length; i++) {
				System.out.print("학생 이름 : " + grade.getName());
				System.out.print("국어 점수 : " + grade.getKor());
				System.out.print("수학 점수 : " + grade.getMath());
				System.out.println("------------------------------");
				break;
			case 3:
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;

			}

		}

	}
}
