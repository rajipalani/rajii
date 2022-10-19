package com.string.methods;

public class FewString_ {
	public static void main(String[]args) {
		String word="Welcome to my little world";
		String name=word.substring(1,6);
		System.out.println(name);
		char letter=word.charAt(2);
		System.out.println(letter);
		char letter1=word.charAt(25);
		System.out.println(letter1);
		String[] uppercase=word.split("little");
		System.out.println(uppercase);
		
		
	}

}
