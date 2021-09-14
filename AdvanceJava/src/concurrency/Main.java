package concurrency;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
	
public static void main(String[] args) {
	executorInvoke();
	executorServieInvoke();
	
}

private static void executorServieInvoke() {
	ExecutorService executorService= Executors.newFixedThreadPool(10);
	executorService.submit(() -> {System.out.println("executor service example");});
	
}

private static void executorInvoke() {
	Executor executor=new Caller();
	executor.execute(() -> {System.out.println("execute example");});
	
	}
	
}




