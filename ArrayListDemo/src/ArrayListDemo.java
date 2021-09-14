import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	
	public static void main(String[] args)
	{
		List<Integer> arrayList= new ArrayList<Integer>(5);
		
		for(int i=1 ;i<=5;i++) {
			arrayList.add(i);
		}
		arrayList.add(5,99);
		//arrayList.clear();
	//	System.out.println("cleared");
		System.out.println(arrayList);
//	
		
		arrayList.add(2,99);
		
		System.out.println(arrayList);
		
		arrayList.remove(5);
		
		System.out.println(arrayList);
		
		
		Iterator itr = arrayList.iterator();
		 while(itr.hasNext()) {
			 System.out.println(itr.next());
		 }
//		if(arrayList.contains(99))
//		{
//			System.out.println("99 is available");
//		}
		//arrayList.remove(3);
		
	//	System.out.println(arrayList);
//		
//		for(int i=0;i<arrayList.size(); i++)
//			System.out.println(arrayList.get(i)+" ");
		
//		for (int i : arrayList)
//		{
//			System.out.println(i +" ");
//		}
//		
	}

}
