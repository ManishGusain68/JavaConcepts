
public class MyAnotherThread implements Runnable{

	@Override
	public void run() {

   for(int i=10 ; i>0 ;i--) {
	   
	   Thread t=Thread.currentThread();
	   System.out.println("name of myanother thread is "+ t.getName());
	   System.out.println(i);
   }
		
	}

}
