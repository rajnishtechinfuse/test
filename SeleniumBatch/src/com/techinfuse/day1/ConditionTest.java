package com.techinfuse.day1;

public class ConditionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int marks =45;
		
		/*if (marks >=75) {
			System.out.println("Distinction");	
		}*/
		
		/*if (marks >=75) {
			System.out.println("Distinction");	
		}else {
			System.out.println("Passed");
		}*/
		
		if (marks >=75) {
			System.out.println("Distinction");	
		}else if (marks>=60 & marks >75) {
			System.out.println("First Division");	
		}else if (marks>=40 & marks >60) {
			System.out.println("Passed");	
		}else {
			System.out.println("Failed");	
		}
	}
}
