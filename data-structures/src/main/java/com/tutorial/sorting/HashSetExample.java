package com.tutorial.sorting;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Stream;

public class HashSetExample {

	public static void main(String[] args) {
		
		Set setA = new HashSet();

		String element = "element 1";

		setA.add(element);
		setA.add("element 1");
		setA.add("element 1");
		setA.add("element 2");
		setA.add("element 2");
		setA.add("element 3");
		setA.add("element 1");
		
		//System.out.println( setA.contains(element) );
		
		Iterator iterator = setA.iterator();
		while(iterator.hasNext()){
		  String elm = (String) iterator.next();
		  //System.out.println(elm);
		}
		
		for(Object object : setA) {
		    String elm = (String) object;
		    //System.out.println(elm);
		}
		
		Stream stream = setA.stream();

		stream.forEach((elm) -> { System.out.println(elm); });
		
	}
	
}
