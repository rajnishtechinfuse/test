package com.techinfuse.day1;

public class HelloWorld {
	
	public static void main(String[] args) {
		
		System.out.print("Hello Rajnish\t");
		System.out.print("Hello Venu");
		System.out.println("eterysery");
		
		int a =3;
		int b=5;
	//	int sum = num1+num2;
	//	int sub = num1-num2;
		
		ArithmeticLogic myClass = new ArithmeticLogic();
		
		//System.out.println("sum = "+ addNumbers(a,b ));
		
		System.out.println("sum = "+ myClass.addNumbers(a, b));
		System.out.println("subtraction = "+ myClass.subtractNumbers(a, b) );	
	}
	/*
	public static int addNumbers(int num1, int num2){
		int sum = num1+num2;
		return sum;
	}
	
	public static int subtractNumbers(int num3, int num4){
		int sum = num3-num4;
		return sum;
	}*/

}
