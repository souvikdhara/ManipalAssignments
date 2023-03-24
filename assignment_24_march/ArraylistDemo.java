package com.manipal.assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArraylistDemo {

	public static void main(String[] args) {
	//Creating an object of List interface refering to implementing Arraylist object
	 List list=new ArrayList();
	 
	 //Adding Elements in list using inbuilt method add
	 list.add("Aaaaa");
	 list.add("Bbbbb");
	 list.add(null);
	 list.add("Bbbbb");
	 
	 //using the built in methods contains, indexOf, isEmpty etc
	 System.out.println(list.contains("Aaaaa"));
	 System.out.println(list.indexOf(null));
	 System.out.println(list.isEmpty());
	 System.out.println(list.lastIndexOf("Bbbbb"));
	 System.out.println(list.get(0));
	 
	 
	 //initializing an iterator to parse the list contents
	 Iterator it=list.iterator();
	 
	 while(it.hasNext()) {
		 System.out.println(it.next());
	 }
	 }

}
