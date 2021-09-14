package com.lambda.tuto;

public class MainClass {
	
public static void main(String[] args)
{
	
//--------------------Using separate class---------------------------------------------------	
//	MyInterImpel myInter=new MyInterImpel();
//	myInter.sayHello();
	
//---------------------Using anonymous class--------------------------------------------------	
//	MyInter i=new MyInter() {
//
//		@Override
//		public void sayHello() {
//			System.out.println("this is our first anonymous class");
//			
//		}
//		
//	};
//	
//	i.sayHello();
//	
//	MyInter i2=new MyInter() {
//
//		@Override
//		public void sayHello() {
//			System.out.println("from second");
//			
//		}
//		
//	};
//	
//	i2.sayHello();
	
//------------------------Using Lambda Expression-----------------------------------------------------	
	
	MyInter i=() -> System.out.println("this is first time using lambda expression");
	
	
	i.sayHello();
	
//	SumInter sumInter =(int a,int b)-> {
//		return a+b;
//	};
	
	//we can also writ as below
	 SumInter sumInter=(a,b) -> a+b;
	
	System.out.println(sumInter.sum(10, 20));
	
	LengthInter li= (str)-> str.length();
	System.out.println("length of string is :"+li.getLength("manish"));
}
}
