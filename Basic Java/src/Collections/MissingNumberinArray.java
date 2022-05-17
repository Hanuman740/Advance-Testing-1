package Collections;

import java.util.Arrays;

public class MissingNumberinArray {

	public static void main(String[] args) {
		int a1[]= {9,6,4,5,7,0,1};
		Arrays.sort(a1);
		
		int i=1;
		while(i<a1.length) {
			if(a1[i]-a1[i-1]==1) 
			{
			}
			else
			{
				System.out.println("Missing No.is"+(a1[i-1]+1));
			}
			i++;
		}
		
	}

}
