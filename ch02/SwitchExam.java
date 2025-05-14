package ch02;

public class SwitchExam {

	public static void main(String[] args) {
		// 스위치문의 주사위 활용
		
		int num = (int)(Math.random()*6)+1 ; 
		
		switch (num) {
		
		case 1 :
			System.out.println("1번이 나왔습니다.");
			break ;
		case 2 :
			System.out.println("2번이 나왔습니다.");
			break ;
		case 3 :
			System.out.println("3번이 나왔습니다.");
			break ;
		case 4 :
			System.out.println("4번이 나왔습니다.");
			break ;
		case 5 :
			System.out.println("5번이 나왔습니다.");
			break ;
		case 6 :
			System.out.println("6번이 나왔습니다.");
			break ;
			
		default :
			System.out.println("잘못된 주사위 숫자입니다.");
			break ;
			
		} //스위치문 종료
			

	}

}
