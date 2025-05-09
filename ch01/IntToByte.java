package ch01;

public class IntToByte {

	public static void main(String[] args) {
		// 자동타입변환 복습.
		
		byte byteValue = 10 ; 
		int intValue = byteValue ; 
		System.out.println(intValue);
		
		char charValue = '월' ; 
		intValue = charValue ; // charValue로 덮여씌여짐.
		System.out.println("월의 유니코드 값 = " + intValue);
		
		intValue = 2025 ; // 덮어쓰기
		long longValue = intValue ; // long이 int 보다 큰 타입 
		System.out.println(longValue);
		
		intValue = 507 ; 
		double doubleValue = intValue ; // intq 보다 큰 double로 덮어쓰기
		System.out.println(doubleValue);

	}

}
