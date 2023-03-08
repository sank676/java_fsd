package employeee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Salary  {
	public static void main(String[] args)
    {
        ArrayList<Emp> emplist = new ArrayList<Emp>();
        emplist.add(new Emp(101,"sankari",60000));
        emplist.add(new Emp(102,"nimisha",40000));
        emplist.add(new Emp(103,"amritha",120000));
        List<Emp> lis = emplist.stream().sorted(Comparator.comparing(Emp::getSalary).reversed())
				.peek(k->{
				if((k.getSalary()>=50000)&&(k.getSalary()<100000))
					k.setSalary(k.getSalary()+(0.1)*k.getSalary());
				else if(k.getSalary()>=100000)
					k.setSalary(k.getSalary()+(0.05)*k.getSalary());}
			      ).toList();
System.out.println(lis);
		
	}
}
