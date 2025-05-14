package ch02;

public class VarIfExam {

	public static void main(String[] args) {
		// if문 랜덤
		
		
		int score = (int)(Math.random()*30)+71;
		System.out.println("현재 점수는 : " + score);
		String grade ; 
		
	 if(score >=90) {
		if (score >=95) {
			grade = "A+";
		} else {
			grade = "A-";
		}
	} else if(score >=85)  {
			grade = "B+" ;
		} else {
				grade = "B-";	
				
//	} if (score >= 70) {
	//		grade = "C" ;
//	} else {
//		grade = "c-";
			
		
		} //if
	
		System.out.println("학점 : " + grade);
		
		
		
		// switch - if문
		
		
			
	}//main

}//class
