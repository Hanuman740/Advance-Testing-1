package Revision;

public class ArrayLargestNumber {

	public static void main(String[]args) {
		int[]a= {1,2,0,4,3,5,10};
		int max=a[0];
		int min=a[0];
		for(int value:a) {
			if(value>max)
			{
				max=value;
			}
			if(value<min) {
				min=value;
			}
		}
		System.out.println("maximum element:"+max);
		System.out.println("maximum element:"+min);
	}
}
