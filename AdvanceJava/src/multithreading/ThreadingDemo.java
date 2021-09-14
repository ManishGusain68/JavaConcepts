package multithreading;

public class ThreadingDemo {
	
	public static void main(String[] args) {
		int n=10;
		
		for(int i=0;i<n;i++)
		{
		Thread1 t1=new Thread1();
		t1.start(); // start method is the internal method of Thread class which in turn going to call the run method
		
		
		Thread t2= new Thread(new Thread2());  // when we using Runnable interface
		t2.start();
		}
		
	} 
	
	

}
