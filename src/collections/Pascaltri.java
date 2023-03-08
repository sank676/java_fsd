package collections;
import java.io.*;
public class Pascaltri {
	
	 
	
	    public int factorial(int i)
	    {
	        if (i == 0)
	            return 1;
	        return i * factorial(i - 1);
	    }
	    public static void main(String[] args)
	    {
	        int n = 4, i, j;
	        Pascaltri g = new Pascaltri();
	        for (i = 0; i <= n; i++) {
	            for (j = 0; j <= n - i; j++) {
	 
	                
	                System.out.print(" ");
	            }
	            for (j = 0; j <= i; j++) {
	 
	                
	                System.out.print(
	                    " "
	                    + g.factorial(i)
	                          / (g.factorial(i - j)
	                             * g.factorial(j)));
	            }
	 
	            // for newline
	            System.out.println();
	        }
	    }
	}


