package ustbatchno3.junit5testcases;

import java.time.LocalDate;
import java.util.List;

public class Textile {
	
		public static long countgarments(List<String> items, LocalDate dateBefore) {
			
			return items.stream().count();
		}

		public static long countprice(List<Integer> price, LocalDate dateBefore) {
			return price.stream().mapToInt(Integer::intValue).sum();
		};
		

}