package ustbatchno3.junit5testcases;

import java.time.LocalDate;
import java.time.Month;

/**
 * @author Administrator
 *
 */
public class Empreward {

	public String  findgold(LocalDate date) {
		int dayOfYear=date.getDayOfYear();
		
		if (dayOfYear<80 ||dayOfYear>365) {
			return "****";
		}
		else if(dayOfYear>80&&dayOfYear<=172)
		{
			return "***";
		}
		else if(dayOfYear>172&&dayOfYear<=266)
		{
			return"*";
		}
		else if (dayOfYear>265&&dayOfYear<=365)
		{
			return " ";
		}
		return "0";
	
		
	}

}


