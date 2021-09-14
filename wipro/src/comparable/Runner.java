package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Runner {
	
	public static void main(String[] args) {
		List<Laptop> list=new ArrayList<>();
		list.add(new Laptop("Dell",16,800));
		list.add(new Laptop("Apple",10,1800));
		list.add(new Laptop("Acer",5,400));
		
		Collections.sort(list);
	System.out.println(list);
	
	for(Laptop i : list)
	{
		System.out.println(i);
	}
		
		
	}

}
