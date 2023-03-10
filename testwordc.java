package ustbatchno3.junit5testcases;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

//import org.junit.Test;

public class testwordc {
	
	
	@Test
	public void countofnames(){
		
		List<String> names=Arrays.asList("sharath","sharath","sharath","sharath","sankari");
		String targetname="sharath";
		long expected=4;
		long actual=Woord.countname(names,targetname);
		assertEquals(expected,actual);
		
		
	}
}
  
