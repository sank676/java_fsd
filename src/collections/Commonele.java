package collections;

import java.util.HashSet;
import java.util.Objects;

public class Commonele {
	public static void main (String[] args) {
		HashSet<Integer> hs1= new HashSet<Integer>();  
		hs1.add(2);  
		hs1.add(4);  
		hs1.add(3);
		hs1.add(9);
		HashSet<Integer> hs2= new HashSet<Integer>();
		hs2.add(4);  
		hs2.add(6);  
		hs2.add(2);
		hs2.add(7);
		hs1.retainAll(hs2);
		System.out.println(hs1);
	}
}

	
	   


