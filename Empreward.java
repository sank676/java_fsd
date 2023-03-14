/*employee gets 5 gold coin if he joined the company after 80 days from the first day(january 1) ,3 gold coins if 172 days and 1 coin if 255 days */


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


