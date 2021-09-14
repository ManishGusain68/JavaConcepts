package com.leaningStream;

import java.util.stream.Stream;

public class StreamObject {

	public static void main(String[] args) {
		
		//1. blank
		Stream<Object> emptyStream=Stream.empty();
		emptyStream.forEach(e -> {System.out.println(e);});
		
		//2. Array,object,collection
		String name[]= {"manish","gusain","ravi"};
		Stream<String> stream1=Stream.of(name);
		System.out.println(stream1);
		stream1.forEach(e -> {System.out.println(e);});
		
		//3. Builder Pattern
		
		Stream<Object> streamBuilder= Stream.builder().build();
		
		//4. 

	}

}
