package org.practice;

public class Array1 {

	public static void main(String[] args) {
		int num [] = new int [5];
		
		num[0] = 10;
		num[1] = 90;
		num[2] = 100;
		num[2] = 50;
		num[4] = 40;
		
		System.out.println("print array using normal for loop");
		int i;
		for(i=0; i<num.length; i++) {
		System.out.println(num[i]);
		}
	}
}
