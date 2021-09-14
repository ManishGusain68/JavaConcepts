package com.singleton;

public class MainClass {

	public static void main(String[] args) {
		
		SingletonDemo sd1=SingletonDemo.getInstance();
		SingletonDemo sd2=SingletonDemo.getInstance();
		SingletonDemo sd3=SingletonDemo.getInstance();

		
		System.out.println(sd1.hashCode());
		System.out.println(sd2.hashCode());
		System.out.println(sd3.hashCode());
		
	}

}
