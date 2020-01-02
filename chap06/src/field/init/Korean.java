package field.init;

public class Korean {

		String nation = "¥Î«—πŒ±π";
		private String name;
		private String ssn;
		
		
		public Korean(String n, String s) {
			name = n;
			ssn = s;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getSsn() {
			return ssn;
		}


		public void setSsn(String ssn) {
			this.ssn = ssn;
		}
		
}
