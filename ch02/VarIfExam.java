package ch02;

public class VarIfExam {

	public static void main(String[] args) {
		// if�� ����
		
		
		int score = (int)(Math.random()*30)+71;
		System.out.println("���� ������ : " + score);
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
	
		System.out.println("���� : " + grade);
		
		
		
		// switch - if��
		
		
			
	}//main

}//class
