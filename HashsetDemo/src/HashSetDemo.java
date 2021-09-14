import java.util.*;

public class HashSetDemo {

	public static void main(String[] args)
	
	{
		Set<String> hash= new HashSet<String>();
		
		hash.add("A");
		hash.add("e");
		hash.add("r");
		hash.add("w");
		hash.add("c");
		hash.add("n");
		
		boolean b1= hash.add("A");
		System.out.println(b1);
		
		
	System.out.println(hash.contains("A"));
	

		
		System.out.println(hash);
		Iterator<String> i= hash.iterator();
		
		System.out.println(i.next());
		
		
		//System.out.println(hash.iterator());
		
		//for (String item : hash)
		//{
			//System.out.println(item);
	//	}
		
		
		
		}
		
	}

