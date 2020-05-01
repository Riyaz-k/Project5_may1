package org.collection;

import java.util.*;

public class UserDefinedList2 {
	
	public static void main(String[] args) {
		
		UserDefinedList1 ref = new UserDefinedList1();
		ref.setNum(1212);
		ref.setName("David");
		
		UserDefinedList1 ref2 = new UserDefinedList1();
		ref2.setNum(1212);
		ref2.setName("David");
		
		
		List <UserDefinedList1> li = new ArrayList(Arrays.asList(ref, ref2));
		
		
		
		
		for(UserDefinedList1 x : li) {
			System.out.println(x.getNum());
			System.out.println(x.getName());
			
			
		}
		
	}

}
