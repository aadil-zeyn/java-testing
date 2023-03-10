package USTBatchNo3.junit5testcases;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import USTBatchNo3.junit5testcases.Duplicateword;

public class Testduplicate {
	@Test
	 public void testduplicate() {

		 List<String> words=Arrays.asList("Aadil","girl","Aadil","finla");

		 

		 long expected=2;

		 long actual=Duplicateword.countduplicate(words);

		 assertEquals(expected,actual);



}}
