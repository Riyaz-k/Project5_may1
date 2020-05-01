package org.practice;

public class SingleTon {
	
	static SingleTon s ;
	
	void m1() {
		System.out.println("method 1");
	}
	
	public static SingleTon reference() {
		
		if (s==null) {
		s = new SingleTon();
		}
		return s;
	}
	
	public static void main(String[] args) {
		
		SingleTon s = reference() ;
		s.m1();	
	}
}
