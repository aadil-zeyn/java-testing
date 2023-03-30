package USTBatchNo3.junit5testcases;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Garmentdetails {

	public static void main(String[] args) {
		Garment g11 =new Garment("tshirt",30,200,6000);
		Garment g21=new Garment("shirt",25,250,6250);
		Garment g31=new Garment("nicker",13,200,2600);
		Garment g41=new Garment("mundu",10,200,2000);
		List<Garment> garments1=Arrays.asList(g11,g21,g31,g41);//data of one day
		
		Garment g12 =new Garment("tshirt",30,200,6000);
		Garment g22=new Garment("shirt",25,250,6250);
		Garment g32=new Garment("nicker",13,200,2600);
		Garment g42=new Garment("mundu",10,200,2000);
		List<Garment> garments2=Arrays.asList(g12,g22,g32,g42);//data of one day
		
		Garment g13 =new Garment("tshirt",30,200,6000);
		Garment g23=new Garment("shirt",25,250,6250);
		Garment g33=new Garment("nicker",13,200,2600);
		Garment g43=new Garment("mundu",10,200,2000);
		List<Garment> garments3=Arrays.asList(g13,g23,g33,g43);//data of one day
		
		Map<LocalDate,List<Garment>>e1=new HashMap<>();//maping date to data of days
		
		
		LocalDate d1=LocalDate.of(2023, 1, 1);
		LocalDate d2=LocalDate.of(2023, 2, 2);//dates
		LocalDate d3=LocalDate.of(2023, 3, 3);
		
		List<LocalDate> dates=Arrays.asList(d1,d2,d3);//inserted the dates into a list for "for loop"
		
		e1.put(d1,garments1);
		e1.put(d2,garments2);//inserting into the map
		e1.put(d3,garments3);
		
		int y=2023,m=1,d=1;
		LocalDate test=LocalDate.of(y, m, d);//test date
		
		List<Garment> result=dailysalesquantity(test,e1,dates);//calling functions
		System.out.println(result);

	}
	public static List<Garment> dailysalesquantity(LocalDate test,Map<LocalDate, List<Garment>> e1,List<LocalDate> dates){
		for(LocalDate d: dates) {//looping for retrieving data
			if(test.isEqual(d)) {
				return e1.get(d);
			}
		}return null;

		
	}
	

}
