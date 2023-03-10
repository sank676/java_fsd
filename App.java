package ustbatchno3.junit5testcases;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println( "Enter a number");
    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
    	//int n=6;
    	if(n%2==0)
    	{
    		System.out.println( "EVEN" );
    	}
    	else
    	{
    		System.out.println( "ODD" );
    	}
       
    	
    }
}
