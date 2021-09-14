import java.util.*;

public class StackDemo {

	public static void main(String[] args)
	{
		Stack<String> st= new Stack<>();
		
		//Stack follow LIFO 
		
		st.push("manish");
		st.push("gusain");
		st.push("rocks");
		st.push("again");
		st.push("code");
		
		System.out.println(st);
		
		String poppedElement= st.pop();   // pop() method retuen the element which is popped out
		System.out.println("poppoed element: "+ poppedElement);
	
		System.out.println(" top element: "+ st.peek());
		System.out.println("now the stack is: "+ st);
		
	}
}
