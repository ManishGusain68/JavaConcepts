package Array;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String arg[])
	{
		int aray[] ;
		
		aray= new int[10];
		
		aray[0]= 1;
		aray[1]= 2;
		aray[2]= 300;
		aray[3]= 400;
		aray[4]= 500;
		aray[5]= 600;
		aray[6]= 700;	//double a= 800.88998;
		//float f= (float)a;
	  byte number = 10;
	  
	  int ch= number;
		
		
		aray[7]= ch;
	
		//aray[8]= 900;
		//aray[9]= 1000;
		
		System.out.println(Arrays.toString(aray));
		Arrays.sort(aray);
		System.out.println(Arrays.toString(aray));
		System.out.println("element at index 0 is "+ aray[0]);
		System.out.println("element at index 7 is "+ aray[7]);
		int sum=0;
		
		for (int i : aray)
		{
			System.out.println(i);
			
				
			 sum=sum+i;
			
				
		}
		 System.out.println("Addition of array is :"+ sum );
	}
}
