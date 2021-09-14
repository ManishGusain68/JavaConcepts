import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
public static void main(String[] args)
{
	Queue<String> queue= new PriorityQueue<>();
	
	queue.add("india");
	queue.add("malaysia");
	queue.add("dubai");
	queue.add("mumbai");
	queue.add("delhi");
	queue.add("agra");
	
	System.out.println(queue); // it will publish random order of queue bcoz sys out doesnot follow
	
	queue.remove();   // remove the head element of sorted queue
	System.out.println(queue);  
	
	
	
	System.out.println("head element of the queue is : " + queue.peek());
	
	//.peek() method is just to view head element
	
	String removedHead = queue.poll(); //.poll() method to remove and return the head element
	System.out.println("removed head element of the queue is : " + removedHead);
	
	System.out.println(queue);  
	
	
	
}
}
