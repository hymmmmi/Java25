package ex01;

public class CarExam {

	public static void main(String[] args) {
		// car 객체 생성
		Car myCar = new Car();
		//필드 사용
		myCar.speed = 60;
		System.out.println("나의 자동차 속도는 현재 : " + myCar.speed); //필드 값 읽기
		System.out.println("제작회사 : " + myCar.company);
		System.out.println("모델명 : " + myCar.model);
		System.out.println("색상 : " + myCar.color);
		System.out.println("최고속도 : " + myCar.maxSpeed);
		System.out.println("생산년도 : " + myCar.produtionYear);
		System.out.println("주행속도 : " + myCar.currentSpeed);
		System.out.println("시동상태 : " + myCar.engineStart);
//		
		Car myCar1 = new Car();
		System.out.print("(기본생성자)차량정보 : " + myCar1.model);
		System.out.print(myCar1.company + myCar1.color + myCar1.maxSpeed);
		System.out.println();
		
		Car myCar2 = new Car("SUV");
		System.out.print("차량정보 : " + myCar2.model);
		System.out.print(myCar2.company + myCar2.color + myCar2.maxSpeed);
		System.out.println();
		
		Car myCar3 = new Car("SUV","빨강");
		System.out.print("차량정보 : " + myCar3.model);
		System.out.print(myCar3.company + myCar3.color + myCar3.maxSpeed);
		System.out.println();
		
		Car myCar4 = new Car("세단","파랑",200);
		System.out.print("차량정보 : " + myCar2.model);
		System.out.print(myCar4.company + myCar4.color + myCar4.maxSpeed);
		System.out.println();
		
		

		

	}

}
