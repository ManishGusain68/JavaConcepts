package overridingconcept;

public class Teacher extends Person {

//	public static void speak() {    // error bcoz this method is static
//		System.out.println("teacher speaks";)
//	}
	
	public static void speak() {
		System.out.println("teacher speaks");
	}
}
