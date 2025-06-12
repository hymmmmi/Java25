package ch06.promotion.tire;

public class Car {
	Tire frontLtire = new Tire("앞왼쪽",6);
	Tire frontRtire = new Tire("앞오른쪽",2);
	Tire backLtire = new Tire("뒤왼쪽",3);
	Tire backRtire = new Tire("뒤오른쪽",4);
	//객체 생성
	
	//생성자
	int run( ) {
		if(frontLtire.roll()==false) {stop(); return 1;};
		if(frontRtire.roll()==false) {stop(); return 2;};
		if(backLtire.roll()==false) {stop(); return 3;};
		if(backRtire.roll()==false) {stop(); return 4;};
		return 0 ;
	}
	void stop() {
		System.out.println("자동차가 멈춥니다");
	}
}
