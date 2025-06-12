package ch06.extended.phone;

public class DmbPhoneExam {

	public static void main(String[] args) {
		// 
		DmbCellPhone dmbPhone = new DmbCellPhone("디엠비폰", "빨강", "010-123-4567", 10);
		//생성자통해서 값 설정
		System.out.println("모델 : " + dmbPhone.model);
		System.out.println("색상 : " + dmbPhone.color);
		System.out.println("번호 : " + dmbPhone.phonenum);
		//부모필드
		System.out.println("채널번호 : "+dmbPhone.channel);
		System.out.println("----------------------------");
		
		dmbPhone.powerOn();
		dmbPhone.bell();
		dmbPhone.sendVoice("여보세요");
		dmbPhone.receiceVoice("앙녕하세요");
		dmbPhone.sendVoice("넹");
		dmbPhone.receiceVoice("종료합니다");
		dmbPhone.hangup();
		System.out.println("----------------------------");
		
		dmbPhone.trunOnDmb();
		dmbPhone.changeChannelDmb(15);
		dmbPhone.trunOffDmb();
		
		
		

	}

}
