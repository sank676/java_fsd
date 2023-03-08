package hotel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Customer {
	public static void main(String[] args)
    {
        ArrayList<Customerdetails> c = new ArrayList<Customerdetails>();
        c.add(new Customerdetails("101","sankari",1235678,"sesdxrffrff@44","tvm"));
        c.add(new Customerdetails("102","nimisha",34567888,"sed24344@dfvgg","ekm"));
        c.add(new Customerdetails("103","amritha",4256620,"sedrr245@dff","kztm"));
        Scanner sc =new Scanner(System.in);
        System.out.println("enter customer id");
        String id=sc.next();
        
       
       List< Customerdetails >t = c.stream().filter(f ->f.getCid().equals(id)).toList();
       if(id.isEmpty()) {
    	   System.out.println("not found");
       }
       else {
        System.out.println(t);
        {
}
       }
       }}


