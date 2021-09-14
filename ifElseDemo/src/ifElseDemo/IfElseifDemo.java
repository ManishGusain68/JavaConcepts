package ifElseDemo;

public class IfElseifDemo {
	 public static void main(String[] args) {

	        int testscore = 76;
	        char grade;

	       if(testscore >= 90)
	       {
	    	   grade = 'A';
	    	   }
	       else if(testscore >=80)
	       {
	    	   grade = 'B';
	       }
	       else 
	       {
	    	   grade = 'C';
	       }
	       
	       System.out.println("Grade is =" + grade);
	    }

}
