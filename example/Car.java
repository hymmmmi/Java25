package example;

public class Car { // Car 클래스 공용으로 생성
	//필드 (객체 데이터가 저장되는 곳)
	//---고유의 데이터---
	
	String company = "볼보"; // 제작회사
	String model ; // 모델
	String color ; //색상
	int maxSpeed ; //최고속도
	int produtionYear = 2022 ; //생산년도
	int currentSpeed = 100 ; //주행속도
	boolean engineStart = true ; //시동상태
	// ---- 상태 ----
	int speed ; //현재속도
	int rpm ; //현재엔진회전수
	
	//생성자 (객체 생성시 초기화 역할 담당)
	Car() {
		
	}
	Car (String model) { //  모델값만 받는 생성자
		this.model = model ;
	}
	Car(String model, String color) { //모델값과 색상정보
		this.model = model ;
		this.color = color ; 
	}
	Car(String model, String color, int maxSpeed) {
		//모델과 색상정고 , 속도정보
		this.model = model ;
		this.color = color ; 
		this.speed = speed ;
	}
	Car(int speed, int maxSpeed) {
		this.speed = speed ;
		this.maxSpeed = maxSpeed ;
	}
	Car(String color, int maxSpeed) {
		this.model = model ;
		this.maxSpeed = maxSpeed ;
	}

}
