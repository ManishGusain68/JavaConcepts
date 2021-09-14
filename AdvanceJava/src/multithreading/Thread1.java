package multithreading;

public class Thread1 extends Thread{

	public void run()
	{ try {
		System.out.println("Thread 1 is running");
	}
	catch(Exception e) {
		System.out.println("exception raised"+ e);
		
	}
	}
	
	
	
}
