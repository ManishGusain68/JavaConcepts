package Serializable;

import java.io.Serializable;

public class Student implements Serializable {

private static final long serialVersionUID= 1L;  

// this is added so that java can uniquely identify the object once its serialized and deserialized
//to keep the version track 
//one you serialized what if somebody hops over network line and change the representation of the object and consumer application will get different copy of object
// java way to make sure that the same version which producer application is producing is consumed by consumer application
//when you do an update to the object its gonna incement the serialVersionUID by 1 before deserializing


String name;
int age;
String address;
transient int x;


public Student(String name, int age, String address) {
	
	this.name = name;
	this.age = age;
	this.address = address;
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



public int getX() {
	return x;
}

public void setX(int x) {
	this.x = x;
}

public String toString() {
	return ("Student name is:"+ this.getName() +", age is"+ this.getAge() + "and address is :"+ this.getAddress());
	
	
}



}
