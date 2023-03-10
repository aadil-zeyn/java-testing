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
		List<Garment> garments1=Arrays.asList(g11,g21,g31,g41);
		
		Garment g12 =new Garment("tshirt",30,200,6000);
		Garment g22=new Garment("shirt",25,250,6250);
		Garment g32=new Garment("nicker",13,200,2600);
		Garment g42=new Garment("mundu",10,200,2000);
		List<Garment> garments2=Arrays.asList(g12,g22,g32,g42);
		
		Garment g13 =new Garment("tshirt",30,200,6000);
		Garment g23=new Garment("shirt",25,250,6250);
		Garment g33=new Garment("nicker",13,200,2600);
		Garment g43=new Garment("mundu",10,200,2000);
		List<Garment> garments3=Arrays.asList(g13,g23,g33,g43);
		Map<LocalDate,List<Garment>>e1=new HashMap<>();
//		Map<LocalDate,List<Garment>>e2=new HashMap<>();
//		Map<LocalDate,List<Garment>>e3=new HashMap<>();
		LocalDate d1=LocalDate.of(2023, 1, 1);
		LocalDate d2=LocalDate.of(2023, 2, 2);
		LocalDate d3=LocalDate.of(2023, 3, 3);
		List<LocalDate> dates=Arrays.asList(d1,d2,d3);
		e1.put(d1,garments1);
		e1.put(d2,garments2);
		e1.put(d3,garments3);
		int y=2023,m=1,d=1;
		LocalDate test=LocalDate.of(y, m, d);
		
		List<Garment> result=sasi(test,e1,dates);
		System.out.println(result);

	}
	public static List<Garment> sasi(LocalDate test,Map<LocalDate, List<Garment>> e1,List<LocalDate> dates){
		for(LocalDate d: dates) {
			if(test.isEqual(d)) {
				return e1.get(d);
			}
		}return null;

		
	}
	

}
