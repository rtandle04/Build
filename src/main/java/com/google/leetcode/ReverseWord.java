package com.google.leetcode;

public class ReverseWord {

	public static void main(String[] args) {
		
		reverseString("Hi hello welcome");
		
	}
	
	private static void reverseString(String str) {
		
		String[] split = str.split("");
		for (String string : split) {
			System.out.println(string);
		}
		int last=split.length;
		for(int index=0;index>split.length/2;index++) {
			
			String temp=null;
			
			temp=split[index];
			split[index]=split[last-1];
			split[last-1]=temp;
			
		}
		
	}

}
