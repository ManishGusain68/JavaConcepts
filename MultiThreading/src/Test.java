
public class Test {

	public static void main(String[] args) {
		
		MyThread thread1=new MyThread();
		MyAnotherThread thread2=new MyAnotherThread();
		
		Thread t1=new Thread(thread1);
		Thread t2=new Thread(thread2);
		
		
		
		t1.start();	
		t2.start();
	}

}
