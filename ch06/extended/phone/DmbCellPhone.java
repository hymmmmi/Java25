package ch06.extended.phone;

public class DmbCellPhone extends CellPhone { 
	//자식필드
	int channel ; //자식 필드
	
	
	//생성자
	DmbCellPhone(String model, String color, String phonenum, int channel){
		this.model = model;
		this.color = color ;
		this.phonenum = phonenum;
		this.channel = channel;
	}
	//메소드 > 자식클래스 추가된 기능
	void trunOnDmb() {
		System.out.println("채널" + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel ;
		System.out.println("채널을" + channel + "번으로 변경합니다.");
	}
	void trunOffDmb() {
		System.out.println("DMB 방송 수신을 종료합니다.");
	}
}
