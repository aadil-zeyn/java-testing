package USTBatchNo3.junit5testcases;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
/**
 * @author Administrator---entharoo mahanu favuluuuuu entharo mahanu faci
 *
 */
public class TestEvenorOdd {
    
    
    //number is even
    @Test
    public void testEven() {
        
        int number=10;
        
        boolean result =isodd(number);
        assertFalse(result);
        
    }
    @Test
    public void testOdd() {
        
        int number=1;
        
        boolean result =isodd(number);
        assertTrue(result);
        
    }
      public boolean isodd( int number) {
          return number%2!=0;
          
      }
}