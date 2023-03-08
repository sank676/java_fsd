package functinterface;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Predicatedemo {
	public static void main (String[] args) {
		List<String> s=Arrays.asList("ekm","tvm","kklm","klm");
		List<String> places= s.stream().filter(t->t.startsWith("k")).collect(Collectors.toList());
System.out.println(places);
		
	}

	

}