package synchronizingExample;

public class MyMain {

	public static void main(String[] args) {
		Company comp=new Company();
      Producer produce=new Producer(comp);
      Consumer consume=new Consumer(comp);
      
      produce.start();
      consume.start();

	}

}
