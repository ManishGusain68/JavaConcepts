package ifElseDemo;

public class SwitchDemo {
 public static void main(String args[])
 {
	 int month=1;
	 String monthstring;
	 
	 switch(month) {
	 case 1:
		 monthstring="January";
         break;
	 case 2:
		 monthstring="February";
		 break;
	 case 3:
		 monthstring="march";
		 break;
		 default:
			 monthstring="invalid month";
			 break;
	 }
	 
	 System.out.println("Month is=" + monthstring);
	 
 }
}
