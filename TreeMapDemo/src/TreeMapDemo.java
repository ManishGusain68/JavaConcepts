import java.util.*;

public class TreeMapDemo {
	
	public static void main (String[] args)
	{
		TreeMap<Integer,String> tmap= new TreeMap<>();
		tmap.put(3,"manish");
		tmap.put(2, "gusain");
		tmap.put(1, "singh");
		 System.out.println(tmap);
		 
		 System.out.println(tmap.get(1));
		
		 
//		 for (Integer in : tmap.keySet())
//		 {
//			 System.out.println(in);
//		 }
//		
	}

}
