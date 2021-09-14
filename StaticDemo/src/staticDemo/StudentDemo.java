package staticDemo;

public class StudentDemo {
 public static void main (String args[]) {
	 Student manish= new Student("manish", 31,"Dehradun") ;
	 System.out.println("name of student is :"+ manish.getName());
	 System.out.println("age of student is :"+ manish.getAge());
	 System.out.println("address of student is :"+ manish.getAddress());	 
	 System.out.println("college name is :"+ manish.getCollege());
	 System.out.println("college name is :"+ manish.getCollege());
	// manish.studentCount();
	 Student manish1= new Student("manish", 31,"Dehradun") ;
	 Student manish2= new Student("manish", 31,"Dehradun") ;
	 Student manish3= new Student("manish", 31,"Dehradun") ;
	 
	System.out.println("count is :"+ manish3.getCount());
	 
 }
}
