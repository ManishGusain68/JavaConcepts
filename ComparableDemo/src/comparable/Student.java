package comparable;

public class Student implements Comparable<Student> {
	
	private int rollnumber;
	private String name;
	private int age;
	public Student(int rollnumber, String name, int age) {
		
		this.rollnumber = rollnumber;
		this.name = name;
		this.age = age;
	}
	public int getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int compareTo(Student arg0) {
	
		return this.rollnumber- arg0.rollnumber;
	}
	
	
	

}
