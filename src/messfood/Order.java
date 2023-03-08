package messfood;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Order {
	public static void main(String[] args)
    {
        ArrayList<Foods> canteen = new ArrayList<Foods>();
        canteen.add(new Foods(101,"sankari","veg meals","80"));
        canteen.add(new Foods(104,"elsa","fish meals","120"));
        canteen.add(new Foods(106,"tessy","veg meals","80"));
        
        
        
    }
        
        /*ArrayList<Price> f = new ArrayList<Price>();
        f.add(new Price("veg meals","80"));
        f.add(new Price("fish meals","120"));
        f.add(new Price("chappathi veg","40"));
        f.add(new Price("chappathi chicken","120"));
        f.add(new Price("veg fried rice","90"));
        f.add(new Price("chicken fried rice","150"));
        
        
        Scanner sc =new Scanner(System.in);
        System.out.println("enter customer id");
        int id=sc.nextInt();
    }
        
       
       List< Foods >t = canteen.stream().peek(k->{
			if(k.getId()==id)
				k.getFood();
			}
		      ).toList();
   
        System.out.println(t);
       }/*
       
}


