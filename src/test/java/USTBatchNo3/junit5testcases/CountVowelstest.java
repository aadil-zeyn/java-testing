package USTBatchNo3.junit5testcases;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class CountVowelstest {

 

 @Test

 public void counttesting() {

 

 String input ="sharath";

 

 int expected=2;

 int actual=CountVowelstest.vowelsCount(input);

 assertEquals(expected,actual);

 

 }
}
 

 
