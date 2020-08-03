package com.ibm.java.fp;


class Runner implements Runnable{

	public void run() {
		System.out.println(Thread.currentThread().getName());
		
	}
	
}

public class ThreadInnercls {
	public static void main(String[] args) {
	Thread thread = new Thread(new Runner());	
		thread.start();
		
		
		thread =new Thread(new Runner() {
			public void run() {
				System.out.println(Thread.currentThread().getName());
			}
		});
		thread.start();
	}
}
