package USTBatchNo3.junit5testcases;

import org.junit.Test;
import USTBatchNo3.junit5testcases.vehiclenumber;

import static org.junit.Assert.assertEquals;

public class vehiclenumbertest {
     
	@Test
     
     public void vehicle(){
		String no="KL07BY8635";
    	 String expected="Ekm";
    	 String actual=Dis(no);
    	 
    	 actual="Ekm";
    	 
    	 assertEquals(expected, actual);
     }
}
