package ch05.bankexam;

public class AccountDTO {
	//개인적인 필드
	
	private String ano ;
	private String owner ;
	private String bank ;
	private int balance ;
	
	
	//생성자
	
	public AccountDTO(String ano, String owner, String bank, int balance) {
		super();
		this.ano = ano;
		this.owner = owner;
		this.bank = bank;
		this.balance = balance;
	}
		
	public AccountDTO() { //기본생성자
	}

	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}

	
	//메서드
	
	@Override
	public String toString() {
		return "AccountDTO [ano=" + ano + ", owner=" + owner + ", bank=" + bank + ", balance=" + balance + "]";
	}
}
