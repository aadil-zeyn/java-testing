package USTBatchNo3.junit5testcases;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.junit.Test;
import USTBatchNo3.junit5testcases.Dupecount;
public class Duplicatewordtest {
	@Test
	 public void testduplicate() {


		List<String> words=Arrays.asList("Aadil","kevin","Aadil","mazha","mazha","dasan");

		 Map<String,Long> expected=new HashMap<>();
		 expected.put("mazha",(long) 2);
		 expected.put("kevin",(long) 1);
		 expected.put("Aadil",(long) 2);
		 expected.put("dasan",(long) 1);
         
		 Map<String,Long> actual=words.stream()
					.collect(Collectors
							.groupingBy(Function.identity(),Collectors.counting()));

		 assertEquals(expected,actual);
}}
