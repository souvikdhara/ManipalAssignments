package com.manipal.assignment;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashTableDemo {

	public static void main(String[] args) {
		//initializing the Map interface with object of the implementing class
		   Map map=new Hashtable();
		   
		   //adding the value in map using the built in method put
		   map.put("one","A");
		   map.put("two","B");
		   map.put("three","C");
		   map.put("Four","D");
		   
		   //demostrating the builtin methods
		   System.out.println(map.get("three"));
		   System.out.println(map.keySet());
		   System.out.println(map.values());
		   System.out.println(map.entrySet());
		   System.out.println(map.containsKey("five"));
		   
		  //initializing the iterator which will iterate through the element of keySet
		  Iterator it =map.keySet().iterator();
		  
		  while(it.hasNext()) {
			  System.out.println(it.next());
		  }
		  }

	}

