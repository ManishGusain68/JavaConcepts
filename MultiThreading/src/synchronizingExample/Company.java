package synchronizingExample;

public class Company {
	int n;
	boolean f=false;
	
	//if f is false chance of producer
	//if f is true chanse of consumer
	 synchronized public void produce_item(int n) throws InterruptedException {
		if(f) {
			wait();
		}
		
		this.n=n;
		System.out.println("Produced :"+ this.n);
		f=true;
		notify();
	}
	
	synchronized public int consume_item() throws InterruptedException {
		
		if(!f) {
			wait();
		}
		System.out.println("consumes :"+this.n);
		f=false;
		notify();
		return this.n;
	}

}
