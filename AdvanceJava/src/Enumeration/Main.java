package Enumeration;

public class Main {
	
	public static void main(String[] args) {
		Color c1= Color.RED;
		System.out.println("Red enum name is :"+ c1.name());
		System.out.println("Red enum value is :"+ c1.getValue());
		
		
		for(Color color : Color.values()) {
			System.out.println("enum value"+ color.getValue());  // for enum values
			System.out.println("enum value"+ color.name());   // for enum name
		}
	}
	
	

}
