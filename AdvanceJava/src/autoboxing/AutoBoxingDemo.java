package autoboxing;

public class AutoBoxingDemo {
public static void main(String[] args) {
	int i=10;
	float f=12.2f;
	
	
	
//	
//	Float fn=f;
//	System.out.println("value of float  : "+ fn);
//	
//	float fnn=Float.valueOf(fn);
//	System.out.println("value of float  : "+ fnn);
	
	//Autoboxing
	Integer iObj= Integer.valueOf(i);
	System.out.println("value of Integer obj : "+ iObj);
	
	//auto unboxing
	
	
	
	int i1=iObj;
	System.out.println("value of i1 : "+ i1);
	
	
	//autoboxing of char
	Character chObj= 'a';
	
	//auto unboxing
	char ch=chObj;
	System.out.println("valus of chObj :"+ chObj);
	System.out.println("value of ch : "+ ch);
	
}
}

