package com.techinfuse.day1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MyMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HashMap<Integer, String> myMap = new HashMap<Integer, String>();
	//	HashMap<Integer, String> myMap = new LinkedHashMap<Integer, String>();
		TreeMap<Integer, String> myMap = new TreeMap<Integer, String>();

	//	HashMap<Integer, Map<String, String>> myMaps = new HashMap<Integer, Map<String, String>>();
		

		myMap.put(201, "Rajnish");
		myMap.put(105, "Nikhil");
		myMap.put(909, "Ruksar");
		myMap.put(407, "Shreya");
		System.out.println(myMap.size());

		System.out.println(myMap.get(407));
		
		//myMap.remove(407);
		System.out.println(myMap.size());
		System.out.println(myMap.get(407));
		System.out.println(myMap);
		
		//myMap.values();
		
		Set<Integer> keys = myMap.keySet();
		for (Iterator iterator = keys.iterator(); iterator.hasNext();) {
			Integer key = (Integer) iterator.next();
			System.out.println("key="+key);
			System.out.println("value="+myMap.get(key));
		}
	}
}

