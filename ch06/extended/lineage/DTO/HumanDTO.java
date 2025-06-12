package ch06.extended.lineage.DTO;

public class HumanDTO {
	// 부모클래스
	//필드
	
	private String name; //이름
	private String sex; //성별
	private String level; //레벨
	private int hp; //에너지
	private int mp;
	private int money; //돈
	
	//생성자
	
	
	//메서드
	
	public HumanDTO() {
		super();
	} //기본생성자
	
	
	//게터세터 
	//게터 = 출력용 세터 = 입력용
	
	public String getName() {
		return name;
	}

	public String getSex() {
		return sex;
	}

	public String getLevel() {
		return level;
	}

	public int getHp() {
		return hp;
	}

	public int getMp() {
		return mp;
	}

	public int getMoney() {
		return money;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	
	
}
