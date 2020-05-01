package org.practice;

public class Cons {

	public static int a =5;
	public int b = 6;
	 
	public Cons(int b) {
		a++;
		b++;
		
		System.out.println("static " +a);
		System.out.println("instance " +  b);
	}
	
	public static void main(String[] args) {
		Cons d = new Cons(1);
		Cons d1 = new Cons(2);
		Cons d2 = new Cons(3);
		
	}
}
 