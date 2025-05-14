package ch02;

public class BreakOutterExam {

	public static void main(String[] args) {
		// break문에 라벨을 붙이면 반복코드 종료시점을 정할 수 잇다.
		
		for(int upper = 1 ; upper <=5 ; upper++) {
			Outter : for(char lower ='A'; lower<='Z'; lower++) {
				
				System.out.println(upper + ":" + lower);
				if (lower == 'F') {
					break Outter;
				}
			}//for
			
		}//for

	}//main

}//class
