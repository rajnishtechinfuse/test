package com.techinfuse.day1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.SortedSet;

public class MySetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HashSet<String> mySet = new HashSet<String>();
		LinkedHashSet<String> mySet = new LinkedHashSet<String>();
		mySet.add("Rupinder");
		mySet.add("Rajnish");
		mySet.add("Rupinder");
		mySet.add("Nazni");
				
		System.out.println(mySet.size());
		//System.out.println(mySet.get(1));
		System.out.println(mySet);
		
		for (Iterator iterator = mySet.iterator(); iterator.hasNext();) {
			String name = (String) iterator.next();
			System.out.println(name);
			
		}

	}

}
