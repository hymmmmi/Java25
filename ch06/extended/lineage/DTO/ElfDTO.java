package ch06.extended.lineage.DTO;

public class ElfDTO extends HumanDTO {
	//휴먼의 자식클래스
	
		//필드
		
		private String bow ;
		private String dress ;
		private String arrow ;
		
		

		//생성자
		
		public ElfDTO() {
			super(); //기본
		}


		//메서드

		public String getBow() {
			return bow;
		}



		public String getDress() {
			return dress;
		}



		public String getArrow() {
			return arrow;
		}



		public void setBow(String bow) {
			this.bow = bow;
		}



		public void setDress(String dress) {
			this.dress = dress;
		}



		public void setArrow(String arrow) {
			this.arrow = arrow;
		}

}
