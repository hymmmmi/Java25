package ch06.promotion.tire;

public class HankTire extends Tire {
	// 자식객체
	// 필드 : 부모필드사용
	
	//생성자
	 public HankTire(String location, int maxRotation) {
		 super(location,maxRotation);
				
	}

	@Override
	public boolean roll() {
		++accRotation; // 누적회전 1씩 증가
		if (accRotation < maxRotation) {
			System.out.println(location + "한국타이어 수명 : "
		+ (maxRotation - accRotation) + "마일리지");
			return true ; // 주행가능 코드
		} else {
			System.out.println("**** 경고 : "+location+"한국 타이어펑크****");
			return false ; //주행가능코드
		}
	}

}
