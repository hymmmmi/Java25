package ch05.exam01.package01;

public class A { //default 접근제한
	//public 을 삭제하면 디폴트 접근제한으로 동작
	
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열");
	
	//생성자
	public A(boolean b) {}
	A(int b) {}
	private A(String s) {}
	

}
