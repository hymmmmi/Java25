package ch01;

public class PromotinExam {

	public static void main(String[] args) {
		// 유니코드와 char
		
		
		char han1 = '가'; 
		char han2 =  44032 ; 
		char han3 = '\uac00' ; 
		
		System.out.println("첫번째 " + han1 );
		System.out.println("두번째 " + han2 );
		System.out.println("세번째 " + han3);
		
		int uniCode1 = '마' ; 
		int uniCode2 = '바' ; 
		int uniCode3 = '사' ;
		
		System.out.println(uniCode1);
		System.out.println(uniCode2);
		System.out.println(uniCode3);
		
		
		long var1 = 20 ; 
		long var2 = 30L ; 
		long var3 = 100000000000L ; 
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		
		
		float var4 = 3.14F ; 
		double var5 = 3.14 ; 
		
		float var6 = 0.12345678987654321F ; 
		double var7 = 0.12345678987654321 ;
		
		System.out.println(var4);
		System.out.println(var5);
		System.out.println(var6);
		System.out.println(var7);
		
		
		boolean stop = false ; 
		
		if(stop) {
			System.out.println("시작하세요.");
		}	else {
			System.out.println("멈추세요. ");
		}
		

		boolean start = true ; 
		
		if(start) {
			System.out.println("시작하세요.");
		}	else {
			System.out.println("멈추세요. ");
		}
		
		
	}

}
