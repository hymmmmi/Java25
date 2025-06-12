package textexam.exam01.DTO;

public class Grade {
	
	private String name;
	private int kor;
	private int math;
	private int total;
	
	public Grade() {
		super();
	}
	
	

	public Grade(String name, int kor, int math, int total) {
		super();
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.total = total;
	}



	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}

	public int getMath() {
		return math;
	}

	public int getTotal() {
		return total;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Grade [name=" + name + ", kor=" + kor + ", math=" + math + ", total=" + total + "]";
	}
	
	
	

}
