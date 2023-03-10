package USTBatchNo3.junit5testcases;

import static org.junit.Assert.assertEquals;

import java.sql.Date;

import java.time.Duration;
import java.time.LocalDate;

import java.time.temporal.ChronoUnit;
import org.junit.Test;
import USTBatchNo3.junit5testcases.goldforemployee;

public class goldforemployeetest {
	
	
	@Test
	public void gold5(){
		int expected=5;
		LocalDate date = LocalDate.of(2023,2,1);
		
		int actual=goldforemployee.countgold(date);
		assertEquals(expected,actual);
	}
	@Test
	public void gold3(){
		int expected=3;
		LocalDate date=LocalDate.of(2023,5,1);
		
		long actual=goldforemployee.countgold(date);
		assertEquals(expected,actual);
	}
	@Test
	public void gold1(){
		int expected=1;
		LocalDate date = LocalDate.of(2023,9,1);
		
		
		long actual=goldforemployee.countgold(date);
		assertEquals(expected,actual);
	}
	

	@Test
	public void gold0(){
		long expected=0;
		LocalDate date=LocalDate.of(2023,11,1);
		
		long actual=goldforemployee.countgold(date);
		assertEquals(expected,actual);
	}
	
	
}
