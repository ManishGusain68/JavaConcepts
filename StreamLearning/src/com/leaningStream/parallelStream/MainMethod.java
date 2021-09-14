package com.leaningStream.parallelStream;

import java.util.ArrayList;
import java.util.List;

public class MainMethod {

	public static void main(String[] args) {
		long t1,t2;
		List<Employee> list=new ArrayList<>();
		for (int i=0 ; i<100  ; i++) {
			list.add(new Employee("Manish", 10000));
			list.add(new Employee("Rocky", 15000));
			list.add(new Employee("Sanjeeta",20000));
		}
		
		t1=System.currentTimeMillis();
		System.out.println("Sequential Stream Count= "+ list.stream().filter(p -> p.getSalary() >15000).count());
		
		t2=System.currentTimeMillis();
		System.out.println("Sequential stream time taken :" + (t2-t1)+"\n");
		
		t1=System.currentTimeMillis();
		System.out.println("Parallel stream count=" + list.parallelStream().filter(p -> p.getSalary() >15000).count());
		t2=System.currentTimeMillis();
		System.out.println("Parallel stream time taken :" + (t2-t1)+"\n");
		
		System.gc();
		System.out.println("Garbage collected");
	}

}
