package org.encapsulation;

import java.util.*;
import java.util.Map.Entry;

public class Encaps2 {
	
	public static void main(String[] args) {
		
		//assign 1st employee
			Encaps e1 = new Encaps();
			e1.setId(10);
			e1.setName("Nisha");
			e1.setPhono(7345622567l);
		
			//assign 2nd employee
				Encaps e2 = new Encaps();
				e2.setId(20);
				e2.setName("Vel");
				e2.setPhono(987656754l);
				
				//assign 3rd employee
					Encaps e3 = new Encaps();
					e3.setId(130);
					e3.setName("ganesh");
					e3.setPhono(8467593467l);
				
				Map<Integer, Encaps> li = new HashMap<Integer, Encaps>();
					li.put(1, e1);
					li.put(2, e2);
					li.put(3, e3);
				
				
				Set<Entry<Integer, Encaps>> e = li.entrySet();
				
				for (Entry<Integer, Encaps> x: e) {
					System.out.println("id is " + x.getValue().getId());
					System.out.println("id is " + x.getValue().getName());
					System.out.println("id is " + x.getValue().getPhono());
				}
	}

}
