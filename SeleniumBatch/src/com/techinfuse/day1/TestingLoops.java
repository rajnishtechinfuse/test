package com.techinfuse.day1;

import java.util.Scanner;

public class TestingLoops {

	public static void main(String[] args) {
		System.out.println("Please enter your number");
		Scanner myScan = new Scanner(System.in);
		String value = myScan.next();
		int num = Integer.parseInt(value);
		
		for (int count = 1; count <=10; count++) {
			System.out.println(num*count);	
		}
		
		
		//Double.parseDouble(s)
		
		//int num=5;
		//int count=11;
		/*while (count<=10) {
			System.out.println(num*count);
			count++;
		}*/
	
		/*do {
			System.out.println(num*count);
			count++;
		} while (count<=10);*/
		
		for (int count = 1; count <=10; count++) {
			System.out.println(num*count);	
		}

	}

}


