
public class MutableDemo {
	
	public static void main(String[] args) {
		
		String st1= "manish";
		
		System.out.println(st1);
		
		
		
		st1 = "gusain";
		
		//old value of st1 was manish which will be removed by garbage collector
		System.out.println(st1);
		
		
		
		String str1="ashish";
		String str2=str1;
		str2="gusain";
		System.out.println(str1);
		System.out.println(str2);
		
		
//		// String are immutable
//		String s1= "Java";
//		s1.concat("world");
//		 System.out.println(s1);
//		//System.out.println(s2);
//		 
//			String s11= "Java";
//			String s12=s1.concat("world");
//			 System.out.println(s11);
//			System.out.println(s12);
		
		String stre=new String("Java");
		String stre2=stre.concat("world");
		System.out.println(stre2);
			
//		stre.concat("world");
//		//stre=new String("Java");
//		System.out.println(stre);
//	//	System.out.println(stre2);	
		
		
	}

}
