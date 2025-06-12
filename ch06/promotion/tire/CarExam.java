package ch06.promotion.tire;

public class CarExam {

	public static void main(String[] args) {

		Car car = new Car();
		
		for(int i=0; i<=10; i++) {
			int problemLocation = car.run();
			
			switch (problemLocation) {
			case 1 : 
				System.out.println("앞왼쪽 한국타이어로 교체");
				car.frontLtire = new HankTire("앞왼쪽",15 );
				break;
			case 2 : 
				System.out.println("앞오른쪽 한국타이어로 교체");
				car.frontRtire = new HankTire("앞왼쪽",15 );
				break;
			case 3 : 
				System.out.println("뒤왼쪽 한국타이어로 교체");
				car.backLtire = new HankTire("앞왼쪽",15 );
				break;
			case 4 : 
				System.out.println("뒤오른쪽 한국타이어로 교체");
				car.backRtire = new HankTire("앞왼쪽",15 );
				break;
			}
			System.out.println("-----------------------");
			
		}

	}

}
