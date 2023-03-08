package practice;

import java.util.Scanner;

public class Fibonacci {
	public static void main( String[] args) {
		int a=0,b=1,c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter limit");
		int n=sc.nextInt();
		System.out.println(a);
		System.out.println(b);
		for(int i=2;i<n;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
		
	}

}
