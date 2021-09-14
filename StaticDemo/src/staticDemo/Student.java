package staticDemo;

public class Student {
	
	static {
		System.out.println("static block is touched");
	}
String name;
int age;
String address;
static String college ="SRM";
static int count = 0;
int id;

public Student(String name, int age, String address) {
	this.name=name;
	this.age=age;
	this.address=address;
	
id =++count;
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

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getCollege() {
	return college;
}

public void setCollege(String college) {
	Student.college = college;
}

//static void studentCount() {
//	count=count+1;
//}

int getCount() {
	return id;
}


}
