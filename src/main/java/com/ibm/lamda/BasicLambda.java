package com.ibm.lamda;

interface Greeter {
	void sayGreet();
}
/**
 * 
 * @author RamakanthTandle
 *
 */
public class BasicLambda {
	public static void main(String[] args) {
		Greeter greet= null;
		
		greet = new Greeter() {
			@Override
			public void sayGreet() {
				System.out.println("sayGreet");
			}
		};
		greet.sayGreet();
		
		greet=()->{
			System.out.println("sayGreet");
		};
		greet.sayGreet();
		 //Thread
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };
      
        runnable.run();
		Runnable newRunnable =()->{
			System.out.println(Thread.currentThread().getName());
		};
		
		Thread thread =new Thread(() -> {
			System.out.println(Thread.currentThread().getName());
		});
		thread.start();
	}

}
