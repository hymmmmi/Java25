package ch06.promotion.tire;

public class KumhTire extends Tire{
	//자식 객체 필드 부모사용
	//생성자
	public KumhTire(String locataion, int maxRotation) {
		super(locataion,maxRotation);
	}
	//메서드

	@Override
	public boolean roll() {
		++accRotation; // 누적회전 1씩 증가
		if (accRotation < maxRotation) {
			System.out.println(location + "금호타이어수명 : " +
		(maxRotation - accRotation) + "마일리지");
			return true ; // 주행가능 코드
		} else {
			System.out.println("**** 경고 : "+location+" 금호타이어펑크****");
			return false ; //주행가능코드
		}
	}
}
