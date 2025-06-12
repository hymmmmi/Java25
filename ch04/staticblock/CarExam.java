package ch04.staticblock;

public class CarExam {
	
	int speed ; //필드
	void run() {}; //메소드

	public static void main(String[] args) {
		CarExam myCar = new CarExam();
		myCar.speed = 60;
		myCar.run();
		System.out.println(myCar.speed + "으로 달립니다.");
		

	}

}
