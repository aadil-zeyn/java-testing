package USTBatchNo3.junit5testcases;

import org.junit.Test;
import USTBatchNo3.junit5testcases.Garmentdetails;
import static org.junit.Assert.assertEquals;

public class vehiclenumbertest {
     
	@Test
     
     public void vehicle(){
		String no="KL07BY8635";
    	 String expected="Ekm";
    	 String actual="";
    	 if(no.substring(2, 4).equals("07") )
    		 actual="Ekm";
    	 
    	 assertEquals(expected, actual);
     }
}
