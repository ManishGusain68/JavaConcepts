
public class MyThread implements Runnable {

	@Override
	public void run() {
		System.out.println("thread is running");
		
		for(int i=0;i<10;i++) {
			Thread t=Thread.currentThread();
			System.out.println("Name of this thread is :"+t.getName());
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}

}
