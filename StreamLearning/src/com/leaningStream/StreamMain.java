package com.leaningStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {

	public static void main(String[] args) {
		
		
		List<Integer> list1=Arrays.asList(12,45,32,111);
		System.out.println(list1);
		
		
//boiler plate code		
//		List<Integer> list2=new ArrayList<>();
//		
//		for(int i : list1)
//		{
//			if(i%2 ==0)
//				list2.add(i);
//		}
//		
//		System.out.println(list2);
		
		//using Stream API
				
		Stream<Integer> stream=list1.stream();
		//predicate
		List<Integer> listNew=stream.filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(listNew);
		
		List<Integer> latestList=list1.stream().filter(i -> i>30 ).collect(Collectors.toList());
		System.out.println(latestList);
		
		
		
	}

}
