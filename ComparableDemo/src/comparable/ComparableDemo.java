package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {
public static void main(String[] args) {
	Student st=new Student(3,"manish", 31);
	Student st1=new Student(1,"rock", 32);
	Student st2=new Student(2,"paper", 33);
	
	ArrayList<Student> list=new ArrayList<>();
	list.add(st);
	list.add(st1);
	list.add(st2);
	
	Collections.sort(list);
	System.out.println("Student after sorting");
	
	list.forEach(student -> System.out.println(student.getName()));
	
	List<Integer> list1=new ArrayList<>();
	list1.add(1);
	list1.add(8);
	list1.add(5);
	System.out.println("unsorted list" + list1 );
	
	Collections.sort(list1);
	
	System.out.println("sorted list" + list1);
	
	
	
	
}
}
