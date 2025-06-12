package ch04.staticblock;

public class Static {
	static String company = "samsung";
	static String model = "LED";
	static String info;

	static {
		info = company + "-" + model;

	}
	int field1;

	void method1() { // 인스턴스 메서드로 사용안됨
	}

	static int field2;

	static void method2() {
	}

	static {
	//	field1 = 10; // 인스턴스
	//	method(); // 인스턴스
		field2 = 20;
		method2();

	}
	static void Method3() {
		// Television tel = new Television ();
//		tel.field1 = 10;
//		tel.method1();
		field2 = 10;
		method2();

	}

}
