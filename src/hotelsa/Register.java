package hotelsa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import hotel.Customerdetails;

public class Register {
	public static void main(String[] args) {
		/*Scanner sc =new Scanner(System.in);
        System.out.println("enter your budget");
        int budget=sc.nextInt();
        if(budget<1000) {
        	System.out.println("abc hotels: 900" );
        }
        else if(budget>=1000 && budget<2000) {
        System.out.println("xyz hotels: 1500");
        }
        else if(budget>=2000 && budget<3000) {
        	System.out.println("hotel qrst: 2500");
        }
        else {
        	System.out.println("no hotels");
        }*/
        	
		ArrayList<Hotel> c = new ArrayList<Hotel>();
        c.add(new Hotel("xyz",900));
        c.add(new Hotel("abc",1500));
        c.add(new Hotel("qrst",2500));	
        Scanner sc =new Scanner(System.in);
        System.out.println("enter budget");
        String budget=sc.next();
        }
	}	

