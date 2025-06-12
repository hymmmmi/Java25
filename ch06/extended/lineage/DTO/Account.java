package ch06.extended.lineage.DTO;

public class Account {
	//로그인 부모클래스
	//필드
	private String id ;
	private String pw ;
	private String nickName ;
	private String elfDTO ;
	private String knightDTO ;
	
	//생성자
	
	public Account() { //기본생성자
		super();
	}

	
	//메서드
	//게터세터
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getElfDTO() {
		return elfDTO;
	}

	public void setElfDTO(String elfDTO) {
		this.elfDTO = elfDTO;
	}

	public String getKnightDTO() {
		return knightDTO;
	}

	public void setKnightDTO(String knightDTO) {
		this.knightDTO = knightDTO;
	}
	
	
}
