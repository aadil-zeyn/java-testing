package USTBatchNo3.junit5testcases;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class vehiclenumber {

	public static void main(String[] args) {
		List<String> no=Arrays.asList("KL07BY8635","KL43BH7576","KL08H7654","KL01F8685");
		Map<String, String> map=new HashMap<>();
		map.put("07", "Ekm");
		map.put("43", "Kochi");
		map.put("08", "Thrissur");
		map.put("01", "Tvm");
		String nUMBER="KL07BY8635";
		String result=no.stream().filter(t->t.no.substring(2, 4).equals(i.get))
		
		
	}

}
