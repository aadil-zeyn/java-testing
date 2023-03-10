package USTBatchNo3.junit5testcases;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Dupecount {

	public static void main(String[] args) {
		List<String> words=Arrays.asList("Aadil","saji","saji","kevin","Aadil","mazha","mazha","dasan");
		Map<String, Long> sasi=count(words);
		System.out.println(sasi);

	}
	public static Map<String, Long> count(List<String> words){
		Map<String,Long> sasi=words.stream()
				.collect(Collectors
						.groupingBy(Function.identity(),Collectors.counting()));
		return sasi;
	}
	

}
