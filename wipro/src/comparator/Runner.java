package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import comparable.Laptop;

public class Runner {
	
	public static void main(String[] args) {
		List<Laptop> list=new ArrayList<>();
		list.add(new Laptop("Dell",16,800));
		list.add(new Laptop("Apple",10,1800));
		list.add(new Laptop("Acer",5,400));
		
		Comparator<Laptop> com= new Comparator<Laptop>()
				{

					@Override
					public int compare(Laptop l1, Laptop l2) {
					 if(l1.getRam()>l2.getRam())
						return 1;
					 else
						 return -1;
					}
			
				};
		
		Collections.sort(list,com);
		
		System.out.println(list);

}
}
