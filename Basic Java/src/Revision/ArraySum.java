package Revision;

public class ArraySum {

public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5,6,7};
		int len=a.length;
		int sum=0;
		for(int i=0;i<=len-1;i++)
		{
			
			sum=sum+a[i];
		}
		System.out.println("Sum of array is: "+sum);
}
}