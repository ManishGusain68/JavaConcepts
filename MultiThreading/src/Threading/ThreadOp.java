package Threading;

public class ThreadOp {
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("program started");
		
		int x=56+34;
		
		System.out.println("Sum is "+ x);
		
		Thread t=Thread.currentThread();
		
		
		
		System.out.println("Current thread is "+ t.getName());
		
		t.setName("my main");  //changed the name of main thread
		
		System.out.println("updated thread is "+ t.getName());  
		System.out.println("id of this thread is "+t.getId());
		//Thread.sleep(5000);
		UserThread ut=new UserThread();
		Thread tuser= new Thread(ut);
		tuser.start();
	
		
		
		
		System.out.println("program ended");
		
		
	}

}
