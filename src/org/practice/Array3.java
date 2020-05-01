package org.practice;

public class Array3 {
	
	String s = "Geepas";
	char cr [] ;
	
	private void m1() {
		// TODO Auto-generated method stub
		
		String cr = s.substring(1,3);
		
System.out.println(cr);
	}
	
	private void m2() {
		// TODO Auto-generated method stub

		
		
		String s[] = null;
		s[0] = "GEEP";
		System.out.println(s.length);
		for (int i = 0; i < s.length; i++) {
			
			
			System.out.println(s[i]);
		}
	}
	
public static void main(String[] args) {
	Array3 arr = new Array3();
	
	arr.m1();
	arr.m2();
			
}
}
