package Revision;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Array {

	public static int getLargest(Integer[]a,int total) {

		List<Integer>list=Arrays.asList(a);
		Collections.sort(list);
		int element=list.get(total-1);
		return element;
	}
	public static void main(String[] args) {
		Integer a[]= {1,12,3,6,5,4,};
		
		Integer b[]= {44,66,99,112,33,22,55};
		
		Integer c[]= {15,12,36,45,78};
		
		 System.out.println("Larget:"+getLargest(a,6));
		 
		 System.out.println("Larget:"+getLargest(b,7));
		 
		 System.out.println("Larget:"+getLargest(c,5));
	}
}