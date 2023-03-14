/*  create an employee object with attribute name,age,yers worked,salary
increment salary based on experience , 1-3 years:2.5% increment,3-6years: 5%,6-10years: 10%,above 10: 12%*/


package ustbatchno3.sonarqubetest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Salary {
	public static void main(String[] args) {
		ArrayList<Employee> emplist = new ArrayList<Employee>();
        emplist.add(new Employee("Arya",22,1,30000));
        emplist.add(new Employee("Sarah",26,4,80000));
        emplist.add(new Employee("sona",27,6,100000));
        emplist.add(new Employee("Maya",32,11,200000));
        List<Employee> s = emplist.stream().sorted(Comparator.comparing(Employee::getYears_worked).reversed())
        		.peek(k -> {
                    if((k.getYears_worked() >= 1) && (k.getYears_worked() < 3)) {
                        k.setSalary(k.getSalary() + (2.5 * k.getSalary()));
                    } else if((k.getYears_worked() >= 3) && (k.getYears_worked() < 6)) {
                        k.setSalary(k.getSalary() + (5 * k.getSalary()));
                    } else if((k.getYears_worked() >= 6) && (k.getYears_worked() < 10)) {
                        k.setSalary(k.getSalary() + (10 * k.getSalary()));
                    } else if(k.getYears_worked() >= 10) {
                        k.setSalary(k.getSalary() + (12 * k.getSalary()));
                    }
                }).toList();
        System.out.println(s);
	}
}
