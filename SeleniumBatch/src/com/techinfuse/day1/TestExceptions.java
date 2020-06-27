package com.techinfuse.day1;

public class TestExceptions {

	public static void main(String[] args) {
		
		try {
			int num1=4;
			int num2 = 0;
			//System.out.println(num1/num2);
			
			int num[] = {1,5,3};
			System.out.println(num[4]);
			
			String name=null;
			System.out.println(name.length());
			
		
			
		}catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Please check your number, its seems some divide by zero operation");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Please check your list, it seems you are trying access some element which does not exist");
		}catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("It seems the object which you are trying to use, does not exist");
		}catch (Exception e) {
			System.out.println("Some technical error");
		}finally {
			System.out.println("Inside finally");
		}	
		
	}

}
