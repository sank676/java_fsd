package ustbatchno3.junit5testcases;


import static org.junit.Assert.assertEquals;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

import org.junit.Test;

public class Testempreward {
	@Test
	public void isgoldcoin()
	{
		
		
		@SuppressWarnings("unused")
		Empreward find= new Empreward();
		
		assertEquals(" ",find.findgold(LocalDate.of(2022,12,31)));	
		
	}
}
