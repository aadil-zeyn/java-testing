package USTBatchNo3.junit5testcases;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;


public class goldforemployee {

	public static void main(String[] args) {
		Scanner sasi=new Scanner(System.in);
		System.out.println("ENter end date");
		int y=0,m=0,d=0;
		y=sasi.nextInt();
		m=sasi.nextInt();
		d=sasi.nextInt();
		LocalDate date=LocalDate.of(y,m,d);
		int gold=countgold(date);
		System.out.println("amount of gold you will recieve is "+gold);
		
		

	}
    public static  int countgold(LocalDate date) {
		
		LocalDate startdate=LocalDate.of(2023,1,1);
		int count=0;
		long days;
		
			days = ChronoUnit.DAYS.between(startdate,date);
			
			if(days>1&days<=80) count=5;
			else if(days>80&days<=172) count=3;
			else if(days>172&days<=266) count=1;
			else count=0;
			return count;
		
		
	}

}
