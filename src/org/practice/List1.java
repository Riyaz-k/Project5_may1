package org.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class List1 {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();
		
		li.add(10);
		li.add(20);
		li.add(70);
		li.add(40);
		li.add(50);
		li.add(60);
		li.add(10);
		
		
		System.out.println(li);
		
//		//add
//		li.add(3,90);
//		System.out.println(li);
//		
//		//remove value in List
//		int i = li.remove(3);
//		System.out.println(i);
//		
//		//find out position
//		int j = li.indexOf(10);
//		System.out.println(j);
//		
//		//there is no value called 90.
//		int k = li.indexOf(90);
//		System.out.println(k);
//		
//		//check whether value 
//		
//		boolean b = li.contains(30);
//		System.out.println(b);
//		
//		//to check whether it is empty
//		List<Integer> si= new LinkedList<Integer>();
//		System.out.println(si);
//		//to check
//		boolean b1 = si.isEmpty();
//		System.out.println(b1);
//		
//		//copy of all value from Li to si and some new values to si
//		
//		si.addAll(li);
//		si.add(70);
//		si.add(80);
//		si.add(90);
//		
//		System.out.println(si);
//		
//		//to print common value b/w Li & si
//		
////		si.retainAll(li);
////		System.out.println(si);
////		
//		//to remove  value b/w Li & si and print rest
//		
//				si.removeAll(li);
//				System.out.println(si);
//				
		//Iterate using for loop
				for (int i =0; i<li.size(); i++) 
				{
					Integer name = li.get(i);
					
					System.out.println(name);
					
				}
				
//				for (Integer x:li) {
//			
//					System.out.println(x);
//					
//				}	
		
}
	

}
