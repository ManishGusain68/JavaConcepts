package com.leaningStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Methods {

	public static void main(String[] args) {
//filter method		
		List<String> names = Arrays.asList("Manish", "Mango", "Ravi", "Rahul");
		List<String> newNames = names.stream().filter(e -> e.startsWith("M")).collect(Collectors.toList());
		System.out.println(newNames);

//map method
		List<Integer> numbers = Arrays.asList(12, 34, 23, 56);
		List<Integer> squareNumbers = numbers.stream().map(e -> e * e).collect(Collectors.toList());
		System.out.println(squareNumbers);

		List<Double> squareRoot = numbers.stream().map(e -> Math.sqrt(e)).collect(Collectors.toList());
		System.out.println("square root of the element :"+squareRoot);
//sorted method
		numbers.stream().sorted().forEach(e -> {
			System.out.println(e);
		});

//min method

		Integer intr = numbers.stream().min((x, y) -> x.compareTo(y)).get();

		System.out.println("minimum number is :" + intr);

//max method

		Integer inter = numbers.stream().max((x, y) -> x.compareTo(y)).get();
		System.out.println("maximum number is :" + inter);
	}
}