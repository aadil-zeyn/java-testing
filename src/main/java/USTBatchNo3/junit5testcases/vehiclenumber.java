package USTBatchNo3.junit5testcases;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class vehiclenumber {

	public static void main(String[] args) {
		String n="TN09BY8635";
		
		System.out.println("State ="+Sta(n));
		System.out.println("District= "+Dis(n));
		
		
	}
	public static String Dis(String n) {
		List<String> distritsKerala=Arrays.asList("07-Ernakulam","02-Kollam","03-Pathanamtitta","43-Kochi","08-Thrissur","01-Tvm");
		List<String> distritsTamilNadu=Arrays.asList("07-Thirupathy","09-Nagaroil","67-Chennai");
		String d=n.substring(2, 4);
		String value="";
		List<String> district = null;
		if(n.substring(0,2).equals("KL")) {
		district=distritsKerala.stream().filter(t->t.substring(0,2).equals(d)).toList();}
		if(n.substring(0,2).equals("TN")) {
		district=distritsTamilNadu.stream().filter(t->t.substring(0,2).equals(d)).toList();}
		for(String t:district) {
			value=t.substring(3);
		}
		return value;
			
		
	}
	public static String Sta(String n) {
		List<String> states=Arrays.asList("KL-Kerala","TN-Tamil Nadu");
		String d=n.substring(0, 2);
		String value="";
		List<String> State=states.stream().filter(t->t.substring(0,2).equals(d)).toList();
		for(String t:State) {
			value=t.substring(3);
		}
		return value;
			
		
	}

}
