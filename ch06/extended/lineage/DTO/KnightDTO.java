package ch06.extended.lineage.DTO;

public class KnightDTO extends HumanDTO {
	//휴먼의 자식클래스
	
	//필드
	
	private String sword ;
	private String armor ;
	private String shield ;
	

	//생성자
	
	
	//메서드
	public KnightDTO() {
		super();
	}

	//게터세터
	
	public String getSword() {
		return sword;
	}


	public String getArmor() {
		return armor;
	}


	public String getShield() {
		return shield;
	}


	public void setSword(String sword) {
		this.sword = sword;
	}


	public void setArmor(String armor) {
		this.armor = armor;
	}


	public void setShield(String shield) {
		this.shield = shield;
	}
	
	
	
}
