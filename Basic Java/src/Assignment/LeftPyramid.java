package Assignment;
public class LeftPyramid {
		public void pyra() {
		int a,b,c;
		for(a=1;a<=5;a++)
		{
			for(b=a;b<5;b++)
	 		{
			System.out.print(" ");
			}
			for(c=1;c<=a;c++)
			{
			System.out.print("*");
			}
			System.out.println(" ");
		}
		for(a=1;a<=5;a++)
		{
		for(b=1;b<=a;b++)
 		{
		System.out.print(" ");
		}
		for(c=a;c<5;c++)//1
		{
		System.out.print("*");
		}
		System.out.println(" ");
		}	
		}
		public static void main(String[] args) {
			LeftPyramid obj=new LeftPyramid();
			System.out.println();
			obj.pyra();
			obj.pyra();
			}	
		}
			
		

