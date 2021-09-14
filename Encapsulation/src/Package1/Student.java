package Package1;


public class Student {
	
	
		private String n;    //properties
		private int age;
	    private	String address;
		
		public Student (String name, int age, String address) {
			n=name;
			this.age=age;
			this.address=address;
		}

		public String getN() {
			return n;
		}

		public void setN(String n) {
			this.n = n;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}
	
	
}