package com.techinfuse.day1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class TestingMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//HashMap<Integer, String> myMap = new HashMap<Integer, String>();
		
	//LinkedHashMap<Integer, String> myMap = new LinkedHashMap<Integer, String>();
	TreeMap<Integer, String> myMap = new TreeMap<Integer, String>();
	
	myMap.put(201, "Rajnish");
	myMap.put(104, "Venu");
	myMap.put(708,"Amit");
	myMap.put(510, "Kanika");
	
	System.out.println(myMap.size());
	System.out.println(myMap);
	//System.out.println(myMap.get(708));
	//System.out.println(myMap.get(104));

	Set<Integer> keys = myMap.keySet();
	//myMap.values();
	
	for (Iterator iterator = keys.iterator(); iterator.hasNext();) {
		Integer key = (Integer) iterator.next();
		//System.out.println("Key="+ key +" , Value="+myMap.get(key));
		System.out.println(myMap.get(key));
		
	}
	

	}

}
