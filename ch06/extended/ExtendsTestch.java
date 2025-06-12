package ch06.extended;

public class ExtendsTestch extends ExtendsTest {
	// 자식클래스
	int field2 ; 
	void method2() {
		
	}
	public static void main(String[] args) {
		
		ExtendsTestch b = new ExtendsTestch() ; //빈객체생성
		b.field1 = 10;//부모객체 활용
		b.method1();
		
		b.field2 = 20;
		b.method2();
				
	}
}
