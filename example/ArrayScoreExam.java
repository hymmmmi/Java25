package example;

import java.util.Scanner;

public class ArrayScoreExam {

	public static void main(String[] args) {
		// 배열 사용 성적표
		// 학생수, 점수, 총점과 평균

		Scanner inputInt = new Scanner(System.in);
		Scanner inputString = new Scanner(System.in);

		System.out.println("========성적표========");
		System.out.println("학생 수를 입력하세요.");
		System.out.print(">>> ");
		int count = inputInt.nextInt();
		System.out.println(count + "명의 학생 성적표를 확인합니다.");

		String[] names = new String[count]; // 이름
		int[] scores = new int[count];// 점수

		for (int i = 0; i < scores.length; i++) {

			System.out.println("학생의 이름을 입력하세요");
			System.out.print(">>> ");
			names[i] = inputString.next();

		} // 이름 for

		for (int i = 0; i < scores.length; i++) {

			System.out.println(names[i] + "학생의 점수를 입력하세요");
			scores[i] = inputInt.nextInt();

		} // 학생별 점수입력 for

		System.out.println("======입력된 점수 확인합니다======");
		for (int i = 0; i < scores.length; i++) {

			System.out.println(names[i] + " : " + scores[i] + "점");
		} // 점수확인

		boolean run = true;
		while (run) {
			System.out.print("======수정할 학생 입력 >>> ");
			String name = inputString.next();

			System.out.print("======수정할 점수 입력 >>> ");
			int score = inputInt.nextInt();

			// scores[i] = score;
			System.out.println("수정한 결과 확인");
			System.out.println(name + "학생의 점수 : " + score + "점으로 수정완료.");
			System.out.println("더 수정 하시겠습니까?");
			System.out.println("1. 네 \t2. 아니요.");
			System.out.print(">>> ");
			int ans2 = inputInt.nextInt();

			switch (ans2) {

			case 1:
				System.out.print("======수정할 학생 입력 >>> ");
				String nameT = inputString.next();

				System.out.print("======수정할 점수 입력 >>> ");
				int scoreT = inputInt.nextInt();
				System.out.println(nameT + "학생의 점수 : " + scoreT + "점으로 수정완료.");
				break;

			case 2:
				System.out.println("수정을 마칩니다.");
				System.out.println("======수정 마침======");
				run = false;
				break;

			default:
				System.out.println("다시 선택하세요.");

			}//switch

		}//while
		
		int sum = total(scores);
		System.out.println("1반의 총점 : "+sum+"점 입니다.");
		
		double avg = avgSum(sum,count);
		System.out.println("1반의 평균 : "+avg+"점 입니다.");
		
		
		
	}//main

	private static double avgSum(int sum, int count) {
		// 1반의 평균
		double avg = 0;
		avg = sum/count ;
		return avg;
	}

	static int total(int[] scores) {
		// 1반의 합계
		int sum = 0;
		
		for(int i=0;i<scores.length;i++) {
			sum +=scores[i];
		}
		return sum;
	}//total for

}//class
