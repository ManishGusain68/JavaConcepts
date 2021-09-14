
import java.util.LinkedList;

public class LinkedListDemo {
	
	public static void main(String args[])
	{
		LinkedList<String> list= new LinkedList<String>();
		
		list.add("A");
		list.add("B");
		list.addLast("ii");
		list.add(1,"ww");
		
		System.out.println(list);
		
//		if(list.remove("A"))
//		{
//			System.out.println("A is removed");
//		}
		System.out.print(list);
		
		System.out.print(list.get(1));
		
	}

}
