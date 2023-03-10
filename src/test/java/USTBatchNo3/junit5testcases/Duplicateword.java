package USTBatchNo3.junit5testcases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Duplicateword {

	public static void main(String[] args) {
		Scanner sasi=new Scanner(System.in);
		List<String> words=Arrays.asList("Aadil","girl","Aadil","finla");
		long count=countduplicate(words);
		System.out.println(count);
		
		}
	public static long countduplicate(List<String> words) {
		long count = words.stream().filter(n->n.contains("Aadil")).count();
		
		return count;
		
	}

}
