package com.techinfuse.day1;

interface Pet{
	
	  public void generateReport();
	}


	class Dog implements Pet{
		
	   public void generateReport(){
	     System.out.println("Interface Method Implemented");
	  }
	   public static void main(String args[]){
	     Pet p = new Dog();
	     p.generateReport();
	  }
	}