package textexam.exam01.DTO;

import java.util.Scanner;

public class LoginDTO {
	public String id ; 
	private String pw ;
	
	public LoginDTO() {
		super();
	}

		
	public LoginDTO(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}

	

	public String getId() {
		return id;
	}

	public String getPw() {
		return pw;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}



	

}
