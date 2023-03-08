package collections;

import java.util.HashMap;
//import java.util.HashSet;

public class Hashset {
	public static void main(String[] args) {
		HashMap<Integer,Emp> set =new HashMap<>();
		Emp e1= new Emp(101,22,"sankari","health");
        Emp e2= new Emp(102,22,"nimisha","finance");
        Emp e3= new Emp(103,22,"reyo","finance");
		set.put (101,e1);
		set.put(102,e2);
		set.put(103,e3);
		
		int h1=e1.hashCode();
		int h2=e2.hashCode();
		int h3=e3.hashCode();
		
		System.out.println(h1+" "+h2+" "+h3);
		
		
		
	}

}
