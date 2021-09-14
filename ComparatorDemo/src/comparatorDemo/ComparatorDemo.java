package comparatorDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo {

	public static void main(String[] args) {
		Student sj = new Student(1, "manish", 31);

		Student sj1 = new Student(1, "rock", 1);
		Student sj2 = new Student(1, "solid", 3);
		
		ArrayList<Student> list = new ArrayList<Student>();

		list.add(sj);
		list.add(sj1);
		list.add(sj2);
	
		
		
//		Collections.sort((List<T>) list);

		Collections.sort(list, new AgeComparator());
		System.out.println("Student name after age sorting :");
	
		list.forEach(student -> System.out.println(student.getName()));

	}
		
		
	

	
}
