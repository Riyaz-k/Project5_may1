package org.practice;

import java.util.*;
public class hashMap {
	public static void main(String[] args) {
		Map<String, Integer> mp = new LinkedHashMap();
		
		mp.put("Java", 10);
		mp.put("Java", 20);
		mp.put("Sql", 30);
		mp.put("selenium", 10);
		
		System.out.println(mp);
		
		System.out.println(mp);
		int str = mp.size();
		
		Set<String> str1 = mp.keySet();
		System.out.println(str1);
		
		
		
	}

}
