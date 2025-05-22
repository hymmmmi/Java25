package ch04;

public class WeekEnumExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Week today = Week.WEDNESDAY;
		System.out.println(today == Week.WEDNESDAY);
		
		Week week1 = Week.SATURDAY;
		Week week2 = Week.SATURDAY;
		System.out.println();
		
		
		if(today==Week.SUNDAY) {
			System.out.println("일요일입니다. 집안일을 합시다.");
		}else if (today == Week.MONDAY) {
			System.out.println("월요일입니다.자바 공부를 합니다.");
		}else if (today == Week.TUESDAY) {
			System.out.println("화요일입니다. 오라클db 공부를 합니다.");
		}else if (today == Week.WEDNESDAY) {
			System.out.println("수요일입니다. jsp 공부를 합니다.");
		}else if (today == Week.THURSDAY) {
			System.out.println("목용일입니다. 클라우드 공부를 합니다.");
		}else if (today == Week.FRIDAY) {
			System.out.println("금요일입니다. 파이썬 공부를 합니다.");
		}else if (today == Week.SATURDAY ) {
			System.out.println("토요일입니다. 열화를 봅니다.");
		}
		System.out.println("오늘은 " + today);
		
		
		//name 메서드
		
		Week toDay = Week.WEDNESDAY ; 
		String name = toDay.name();
		System.out.println("객체의 이름은 : "+name);
		
		int ordinal = toDay.ordinal();
		System.out.println("열거순서는 : " + ordinal); 
		// 순서 열거 값은 0부터 시작
		
		Week day1 = Week.MONDAY ;
		Week day2 = Week.WEDNESDAY;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);
		
		
		//value of 메서드
		
		Week weekday = Week.valueOf("MONDAY");
		if(weekday == Week.SATURDAY || weekday == Week.SUNDAY) {
			System.out.println("주말입니다. 푹 쉬세요.");
		}else {
			System.out.println("평일입니다. 공부하세요.");
		}
		
		//values
		
		Week[]days = Week.values();
		for(Week a : days) {
			System.out.print(a + " ");
		}
				
		
	}

}
