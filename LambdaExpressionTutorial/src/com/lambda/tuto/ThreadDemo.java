package com.lambda.tuto;

public class ThreadDemo {

	public static void main(String[] args) {

		Runnable thread1 = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Value of i is" + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		};

		Thread t = new Thread(thread1);
		t.setName("John");
		t.start();
		
		Runnable thread2=()->{
			
			for(int i=1;i<=10;i++) {
				System.out.println(2*i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		Thread t2=new Thread(thread2);
		t2.setName("Table of 2");
		t2.start();

	}
}