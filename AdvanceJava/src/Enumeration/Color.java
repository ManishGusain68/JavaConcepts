package Enumeration;

 enum Color {
	
	RED("red"), GREEN("green"), BLUE ("blue");
	
	 private String value;
	 
	

	private Color(String value) {
		this.value = value;
	}



	public String getValue() {
		return value;
	}

	
	 
	 

}
