package com.techinfuse.day1;

public class MyStringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstName = "Rajnish";
		String lastName = "Kucheria";
	
		
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(firstName.length());
		
		System.out.println(firstName+" "+lastName);
		System.out.println(firstName.concat(" ").concat(lastName));
		System.out.println(firstName.toUpperCase());
		System.out.println(firstName.toLowerCase());
		System.out.println(firstName.equals(lastName));
		//System.out.println(firstName.equals(text));
		//System.out.println(firstName.equalsIgnoreCase(text));
		
		System.out.println(firstName.charAt(1));
		System.out.println(firstName.replace('a', 'z'));
		System.out.println(firstName.replace("Raj", "ZZ"));
		System.out.println(firstName.indexOf('a'));
		
		// start from given index
		System.out.println(firstName.substring(3));
		System.out.println(firstName.substring(3, 5));
		
		String text = "I live in India";
		String names[] = text.split(" ");
		System.out.println(names.length);
		System.out.println(names[0]);
		System.out.println(names[2]);
		
		

	}

}
