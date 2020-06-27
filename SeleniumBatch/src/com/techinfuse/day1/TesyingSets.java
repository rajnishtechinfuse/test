package com.techinfuse.day1;

import java.util.HashSet;
import java.util.Iterator;

public class TesyingSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> mySet = new HashSet<String>();
		
		mySet.add("Rajnish");
		mySet.add("Venu");
		mySet.add("Rajnish");
		mySet.add("Kanika");
		
		System.out.println(mySet.size());
		System.out.println(mySet);
		
		mySet.remove("Venu");
		System.out.println(mySet.size());
		System.out.println(mySet);
		
		for (Iterator iterator = mySet.iterator(); iterator.hasNext();) {
			String name = (String) iterator.next();
			System.out.println(name);	
		}

	}

}
