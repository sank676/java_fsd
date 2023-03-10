package ustbatchno3.junit5testcases;
import countvowel.countvowels;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testcount {
	@Test
	public void counttesting() {
		String input="sharath";
	
		int expected=2;
		int actual=countvowels.vowelscount(input);
		assertEquals(expected,actual);
		
	}

}

