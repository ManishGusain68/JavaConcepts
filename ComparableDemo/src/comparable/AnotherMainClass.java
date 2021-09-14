package comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class AnotherMainClass {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Manish", "Gusian", "Sanjeeta", "Das");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
		List<Integer> linkedList= new LinkedList<>();
		linkedList.add(99);
		
		linkedList.add(12);
		linkedList.add(44);
		
		System.out.println(linkedList);
		Collections.sort(linkedList);
		System.out.println(linkedList);
		
		Student st=new Student(3,"manish", 31);
		Student st1=new Student(1,"rock", 32);
		Student st2=new Student(2,"paper", 33);
		
		List<Student> studentArrayList=Arrays.asList(st,st1,st2);
		studentArrayList.forEach(student -> System.out.println(student.getName()));
		
		Collections.sort(studentArrayList);
		studentArrayList.forEach(student -> System.out.println(student.getName()));
		
		
		
	}

}
