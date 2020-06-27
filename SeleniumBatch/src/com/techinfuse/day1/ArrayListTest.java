package com.techinfuse.day1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(3);
		numbers.add(5);
		numbers.add(2);
		numbers.add(89);*/
		
		/*List<String> names = new ArrayList<String>();*/
		
		//HashSet<String> names = new HashSet<String>();
		//HashSet<String> names = new LinkedHashSet<String>();
		TreeSet<String> names = new TreeSet<String>();
		names.add("Nikhil");
		names.add("Shreya");
		names.add("Rajnish");

		names.add("Shreya");
		names.add("Ruksar");
		//System.out.println(names.size());
		//System.out.println(names.get(1));
		//names.remove(1);
		names.remove("Ruksar");
		System.out.println(names.size());

		//System.out.println(names.get(1));
		
		for (Iterator count = names.iterator(); count.hasNext();) {
			String name = (String) count.next();
			System.out.println(name);
		}

		

	}

}
