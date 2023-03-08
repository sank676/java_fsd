package words;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Count {

	public static void main(String[] args) {
		List<String>words= Arrays.asList("sankari","nimisha","sankari","sankari");
		List<String> wordcount= words.stream().filter(i -> Collections.frequency(words, i) > 1).collect(Collectors.toList());
		 long total = wordcount.stream().count();
		System.out.println(total);

	}



}
