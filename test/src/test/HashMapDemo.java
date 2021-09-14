package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.text.html.HTMLDocument.Iterator;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
		Map<String,Integer> map=new HashMap<>();
		
		map.put("gusain", 68 );
		map.put("sahu", 69);
		map.put("rock", 70 );
		map.put("suman", 71);
		map.put("manish",10);
		
		System.out.println(map);
		System.out.println(map.entrySet());
		
		System.out.println(map.get("saman"));
		System.out.println("removed value is : "+map.remove("sahu"));
		
	
		
		
//		// iterating in hashmap using iterator
		java.util.Iterator<Entry<String, Integer>> itr=  map.entrySet().iterator();
		
		while (itr.hasNext())
		
		{
			System.out.println(itr.next());
		
		}
		
		
		//iterating in hashmap using for loop
//		 for( Entry entry : map.entrySet())
//		 {
//			 System.out.println("key is :" + entry.getKey() + "Value is :" + entry.getValue());
//		 }
		
		
//		System.out.println(map.keySet());
//		System.out.println(map.values());
//		
//	for (String key : map.keySet()) {
//		System.out.println(key);
//		}
//		
//		for (int value : map.values()) {
//			System.out.println(value);
//		}
//		
//		
	}

}
