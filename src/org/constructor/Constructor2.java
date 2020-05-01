package org.constructor;

public class Constructor2 extends Construcor1 {
	
	Constructor2 (){
		super();
		System.out.println("default constructor 2");
	}
	Constructor2 (int a){
			System.out.println("para constructor 2");
				
	}
		
		public static void main(String[] args) {
			Constructor2 c = new Constructor2();
			Constructor2 c1 = new Constructor2(1);
		}

}
