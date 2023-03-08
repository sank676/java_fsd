package collections;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {
	public static void main( String[] args) {
		ArrayList<Integer> num= new ArrayList<Integer>();
		int flag=0;
		num.add(10);
		num.add(5);
		num.add(20);
		num.add(15);
		num.add(3);
		num.add(30);
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				if(num.get(i)+num.get(j)==25) {
				     flag+=1;
					
				}
			}
			
		
		}
		System.out.println("present " +flag+" times");
	}

}
