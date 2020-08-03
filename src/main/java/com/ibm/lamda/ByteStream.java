package com.ibm.lamda;

public class ByteStream {
	
	public static void main(String[] args) {
		String abc="\"Ramakanth Tandle\"";
		
		System.out.println(abc);
		
		byte[] bytes = abc.getBytes();
		
		System.out.println(bytes);
	}

}
