package ch04;

import java.util.Scanner;

public class CarExam {

	public static void main(String[] args) {
		// 
		Scanner input = new Scanner(System.in);
		
		Car myCar = new Car();
		System.out.print("제조회사 : ");
		myCar.company = input.next();
		System.out.print("모델 : ");
		myCar.model = input.next();
		System.out.print("색상 : ");
		myCar.color = input.next();
		
		
		boolean run = true ;
		while (run) {
			System.out.println("1. 차량 정보확인");
			System.out.println("2. 차량 시동걸기");
			System.out.println("3. 차량 주행시작");
			System.out.println("4. 차량 주행종료");
			System.out.print(">>>");
			String select = input.next();
			
			switch (select) {
			case "1" : 
				System.out.println("브랜드 : " + myCar.company);
				System.out.println("모델명 : "+myCar.model);
				System.out.println("색상 : "+myCar.color);
				break ; 
				
			case "2" :
				System.out.println("차량에 시동이 걸렸습니다.");
				myCar.start();
				break ; 
				
			case "3" : 
				System.out.println("차량의 주행을 시작합니다.");
				//System.out.println("이 차량의 현재 속도는 : " + myCar.speed + "km/h, " 
					//	+ "rpm : " + myCar.rpm + "/rpm");
				myCar.drive();
				break;
				
			case "4" :
				System.out.println("차량의 주행을 종료합니다.");
				System.out.println("현재 주유량 : "+myCar.oil+"L 입니다.");
				System.out.println("주유하시겠습니까?");
				System.out.println("1. 리터당 주유 \n2. 금액별 주유\t3. 시동 종료"); 
				System.out.print(">>>");
				int check = input.nextInt();
				
				
	

				
				
			}//switch
		}//while

	}

}
