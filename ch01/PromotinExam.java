package ch01;

public class PromotinExam {

	public static void main(String[] args) {
		// �����ڵ�� char
		
		
		char han1 = '��'; 
		char han2 =  44032 ; 
		char han3 = '\uac00' ; 
		
		System.out.println("ù��° " + han1 );
		System.out.println("�ι�° " + han2 );
		System.out.println("����° " + han3);
		
		int uniCode1 = '��' ; 
		int uniCode2 = '��' ; 
		int uniCode3 = '��' ;
		
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
			System.out.println("�����ϼ���.");
		}	else {
			System.out.println("���߼���. ");
		}
		

		boolean start = true ; 
		
		if(start) {
			System.out.println("�����ϼ���.");
		}	else {
			System.out.println("���߼���. ");
		}
		
		
	}

}
