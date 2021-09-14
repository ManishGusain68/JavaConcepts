
public class Student {
	
	
		String n;    //properties
		int age;
		String address;
		
		public Student (String name, int age, String address) {
			n=name;
			this.age=age;
			this.address=address;
		}
	
		
		
	

public void setName(String name) {
	//this.name= name;
}

public void setAge(int age) {
	this.age = age;
}

public void setAddress(String address)
{
	this.address= address;
}

public String getName() {
	return n;

}

public int getAge() {
	return age;
}

public String getAddress() {
	return address;
}



public static void main(String args[])
{
	Student john = new Student("manish",21,"a big address");
	System.out.println("name of student is "+ john.getName());
	
}


}
