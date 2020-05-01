package org.practice;

public class Instance {
	
	private int a;
	
	
	public Instance(){
		
	a++;
	}
	
	public static void main(String[] args) {
		
	Instance v = new Instance();
	System.out.println(v.a);
	Instance v1 = new Instance();
	
	
	System.out.println(v1.a);
	}

}
