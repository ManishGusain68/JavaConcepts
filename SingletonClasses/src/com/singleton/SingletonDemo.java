package com.singleton;

public class SingletonDemo {
	
	//A singleton class is a class that can have only one object (an instance of the class) at a time.

	public String s;
	private static SingletonDemo single_instance = null;

	private SingletonDemo() {

		s = "Hello I am a string part of Singleton class";
		System.out.println(s);
	}

	public static SingletonDemo getInstance() {
			
		if(single_instance==null)
		{	
			single_instance=new SingletonDemo();
		}
		return single_instance;
	}

}
