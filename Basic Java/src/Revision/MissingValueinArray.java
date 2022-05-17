package Revision;

public class MissingValueinArray {

	public static void main(String[] args) {
		int[]a= {1,2,4,5,6,7};
		int sum1=0;
		
	int len=a.length;
	for(int i=0;i<=len-1;i++) {
		sum1=sum1+a[i];
	}
	System.out.println("sum is"+sum1);
	int sum2=0;
	{
		for(int j=1;j<=7;j++) {
			sum2=sum2+j;
		}
		System.out.println("Overall sum is"+sum2);
		System.out.println("missing no"+(sum2-sum1));
		}
	}	
}
