package com.ibm.java.fp;
//https://notepad.pw/ibmvertx

interface Greter{
	void sayGreet();
}

class GreterImpl implements Greter{

	public void sayGreet() {
		System.out.println("Hello vertex");
		
	}
	
}
public class HelloWorld {
	
	public static void main(String[] args) {
		System.out.println("Hello world ");
		
		Greter greterIml =null;
		greterIml=new GreterImpl();
		greterIml.sayGreet();
		
	/*	//inner class :annoymus inner class
		greterIml =  new Greter();{
			public void sayGreat() {
				
			}
		}; */
	}
	
	//
}
