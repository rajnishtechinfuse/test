package com.techinfuse.day1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class TestingLists {

	public static void main(String[] args) {
		//ArrayList<String> myList = new ArrayList<String>();
		LinkedList<String> myList = new LinkedList<String>();
		
		myList.add("Rajnish");
		myList.add("Venu");
		myList.add("Rajnish");
		myList.add("Kanika");
		
		System.out.println(myList.size());
		System.out.println(myList);
		System.out.println(myList.get(0));
		System.out.println(myList.get(2));
		
		myList.remove(1);
		System.out.println(myList.size());
		System.out.println(myList);
		
		for (Iterator iterator = myList.iterator(); iterator.hasNext();) {
			String name = (String) iterator.next();
			System.out.println(name);	
		}
	}
}
