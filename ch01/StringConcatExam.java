package ch01;

public class StringConcatExam {

	public static void main(String[] args) {
		// String 타입 복습
		
		
		String str1 = "jav" + "10.2" ;
		String str2 = "jav" + 25 ;
		String str3 = str2 + str1 ; 
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		String str4 = "jav" + 10.2 + 25 ; 
		String str5 = 10.2 + 25 + "jav" ; 
		System.out.println(str4); // jav10.225 문자로연결
		System.out.println(str5); // 35.2jav 앞 숫자 + 계산 후 연결
		
		System.out.println("------------------------------------");

		int num1 = 5 ; 
		int num2 = 5 ; 
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 >= num2);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		char char1 = 'a' ; 
		char char2 = 'b' ; 
		boolean result4 = (char1 > char2);
		System.out.println(result4);
		
		
		
	}

}
