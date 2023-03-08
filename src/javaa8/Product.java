package javaa8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Product {
	public static void main (String[] args) {
		List<Productdetails> productlist= new ArrayList<Productdetails>();
		productlist.add(new Productdetails(1,"HP Laptop",5000));  
		productlist.add(new Productdetails(2,"Dell Laptop",30000));  
		productlist.add(new Productdetails(3,"Lenevo Laptop",8000));  
		productlist.add(new Productdetails(4,"Sony Laptop",28000));
		List<Float> product =productlist.stream().filter(p -> p.price > 10000).map(p->p.price).collect(Collectors.toList());                    
        System.out.println(product); 
}
}