package ch06.casting;

public class ChildExam {

	public static void main(String[] args) {
		// 
		Parent parent = new Child();
		
		parent.field1 = "가나다";
		parent.method1();
		parent.method2();
//		parent.method3(); //자식메소드 사용 안됨
//		parent.field2 = "마바사"; //자식필드 사용 안됨
		
		Child child = new Child();
		child.method3();
		child.field2 = "가나다";
		
		Child ch = (Child)parent; //강제타입변환
		ch.method3(); //자식메서드 사용 가능
		ch.field2 = "가나다"; //자식 필드 사용가능
		
		
		
		
//		Child ch = new Child();
//		Parent pr = ch ; 
//		
//		pr.method1();
//		pr.method2();
//		//method 자식 메서드는 호출 불가
//		

	}

}
