package ch02;

import java.util.Scanner;

public class IfExamTwo {

	public static void main(String[] args) {
		// 로또당첨
		// 랜덤값으로 1-45 숫자
		
		Scanner input = new Scanner(System.in);
		System.out.println("로또 1부터 45까지의 번호 중 6개 입력해주세요.");
		
		int num1 = input.nextInt();
		System.out.println("첫 번째 번호 : " + num1);
		int num2 = input.nextInt();
		System.out.println("두 번째 번호 : " + num2);
		int num3 = input.nextInt();
		System.out.println("세 번째 번호 : " + num3);
		int num4= input.nextInt();
		System.out.println("네 번째 번호 : " + num4);
		int num5 = input.nextInt();
		System.out.println("다섯 번째 번호 : " + num5);
		int num6 = input.nextInt();
		System.out.println("여섯 번째 번호 : " + num6);
		
		int ran1 = (int) (Math.random()*45) + 1 ; 
		int ran2 = (int) (Math.random()*45) + 1 ; 
		int ran3 = (int) (Math.random()*45) + 1 ; 
		int ran4 = (int) (Math.random()*45) + 1 ; 
		int ran5 = (int) (Math.random()*45) + 1 ; 
		int ran6 = (int) (Math.random()*45) + 1 ; 
		
		int a = 0 ; 
		
		if(num1==ran1 || num1==ran2 || num1==ran3 || num1==ran4 || num1==ran5 || num1==ran6) {
			
			++a;
		}
		else if(num2==ran1 || num2==ran2 || num2==ran3 || num2==ran4 || num2==ran5 || num2==ran6) {
			
			++a;
		}
		else if(num3==ran1 || num3==ran2 || num3==ran3 || num3==ran4 || num3==ran5 || num3==ran6) {
			
			++a;
		}
		else if(num4==ran1 || num4==ran2 || num4==ran3 || num4==ran4 || num4==ran5 || num4==ran6) {
			
			++a;
		}
		else if(num5==ran1 || num5==ran2 || num5==ran3 || num5==ran4 || num5==ran5 || num5==ran6) {
			
			++a;
		}
		else if(num6==ran1 || num6==ran2 || num6==ran3 || num6==ran4 || num6==ran5 || num6==ran6) {
			
			++a;
		}
		
		
		System.out.println("=======================================");	
		System.out.println("이번주의 로또 당첨 번호 입니다.");
		System.out.println(num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5 + " " + num6);
		System.out.println("=======================================");
		
		
		if (a==0) {
			System.out.println("번호가 하나도 맞지 않았습니다.");
		} else if (a==1) {
			System.out.println("번호가 1개 맞았습니다.");
		} else if (a==2) {
			System.out.println("번호가 1개 맞았습니다.");
		} else if (a==3) {
			System.out.println("번호가 1개 맞았습니다.");
		} else if (a==4) {
			System.out.println("번호가 1개 맞았습니다.");
		} else if (a==5) {
			System.out.println("번호가 1개 맞았습니다.");
		} else if (a==6) {
			System.out.println("번호가 1개 맞았습니다.");
		} else {
			System.out.println("다음 기회에 .... ");
		
		}

	}

}
