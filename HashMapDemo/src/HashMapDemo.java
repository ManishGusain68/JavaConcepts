
import java.util.*;
import java.util.Map.Entry;
public class HashMapDemo {
	
	public static void main(String[] args)
	{
		HashMap<String,Integer> hmap=new HashMap<>();
		
			
		        hmap.put("a", 20);
				hmap.put("b", 22);
				hmap.put("c",40);
				
				 hmap.put("d", 20);
					hmap.put("e", 22);
					hmap.put("f",40);
					 hmap.put("g", 20);
						hmap.put("h", 22);
						hmap.put("q",40);
			System.out.println("size of map is "+	hmap.size());
			System.out.println(hmap);
			
			if (hmap.containsKey("c"))
			{     Integer value =hmap.get("c");
				System.out.println("Key c is present");
				System.out.println("valus in key C is :" + value);
			}
			
			for (String key : hmap.keySet())    //keySet() 	It is used to return a set view of the keys contained in this map.
			{
				System.out.println(key +"="+ hmap.get(key));
			}
			
			for (Entry<String,Integer> entry : hmap.entrySet())    //entrySet() It is used to return a collection view of the mappings contained in this map.
			{
				System.out.println("Key "+ entry.getKey() +" value "+ entry.getValue());
				
			}
	}

}
