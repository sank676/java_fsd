package words;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Wordcount {


	public static void main(String args[])
	{
		System.out.println("Enter String:");
		Scanner sc=new Scanner(System.in);
		String r=sc.nextLine();
		sc.nextLine();
		String v=r.replaceAll("[',!*@;]"," ");
		String [] q=v.split(" ");
		List<String>a=Arrays.asList(q);
		List<String>w=a.stream().map(t->t.toLowerCase()).distinct().toList();
		System.out.println("word count");
		System.out.println(a.size());
		System.out.println("unique words");
		System.out.println(w.size());
		w.forEach(System.out::println);
	}
	}