package ch04;

import java.util.Scanner;

public class Car {
	// 필드
	// 고유데이터
	public String company;
	public String model;
	public String color;
	int MAXSPEED;
	int MINSPEED;
	public String oilType;

	// 상태값 (변동가능)
	public int speed;
	public int rpm;
	public int oil;

	// 기본생성자
	public Car() {
		speed = 0;
		rpm = 100;
		oil = 40;
		

	}

	// 사용자 지정 메서드
	public Car(String company, String model, String color) {
		this.company = company;
		this.model = model;
		this.color = color;
	}

	// 메서드
	
	Scanner input = new Scanner(System.in);
	
	public void start() {
		System.out.println(this.model + "가(이) 주행을 시작합니다.");
		System.out.println("현재 속도 : " + this.speed);
		System.out.println("현재 rpm : " + this.rpm);
		System.out.println("현재 주유량 : " + this.oil);
	}

	public void drive() {
		System.out.println(this.model + "의 주행을 시작합니다.");
			
				
		boolean run = true ;
		while(run) {
				
			System.out.println("1. 악셀 \n2. 브레이크"); 
			System.out.print(">>>");
			int select = input.nextInt();
			
			switch(select) {//주행모드 선택
			case 1 :
				System.out.println("------악셀을 밟습니다.------");
				
				speed += 30;
				rpm += 300;
				MAXSPEED = 300;
				
				System.out.println("현재 속도 : " + speed + "km/h || rpm : " + rpm + "/rpm"); //속도 30씩 증가
				
				if(speed>=120 != speed>=MAXSPEED) { //120속도에서 과속 안내
					System.out.println("현재 속도 : " + speed + "km/h || rpm : " + rpm + "/rpm");
					System.out.println("과속입니다. 안전 운전하세요.");
				} else if (speed >= MAXSPEED) { //맥스에서 속도 증가 정지
					speed = MAXSPEED ;
					System.out.println("이 차량의 최고 속도입니다. ");
				}// 악셀 if문 종료
				break;
				
			case 2 : 
				System.out.println("-----브레이크를 밟습니다. ------");

				speed -= 20 ; 
				rpm -= 200;
				MINSPEED = 0 ;
				
				System.out.println("현재 속도 : " + speed + "km/h || rpm : " + rpm + "/rpm");
				
				if(speed<=MINSPEED) { //미닛 속도에서 속도 정리 
					speed = MINSPEED ; 
					System.out.println("차량이 멈춥니다.");
					
				} 
				run = false ;
				break;			
				
					
							
			}//주행 악셀 브레이크 switch
			
			
		
		}//주행 while
			
		
	}
	
	// public void oilb( ) {
	//	 System.out.println();
				
		//	}
}
