package Assignment;

public class Starmissing {
	public static void Star(){
		int a,b;
		for(a=1;a<=3;a++)		
		{
		for(b=1;b<=5;b++)
		{
			if((a==2&&b==3)||(a==3&&b==2)||(a==3&&b==3)||(a==3&&b==4))
			{
				System.out.print(" ");
		}
			else
			{
				System.out.print("*");
			}
		}
		System.out.println();
		}	
	}
	public static void Star1(){
		int a,b;
		for(a=1;a<=3;a++)		
		{
		for(b=1;b<=5;b++)
		{
			if((a==2&&b==3)||(a==3&&b==2)||(a==3&&b==3)||(a==3&&b==4))
			{
				System.out.print("#");
		}
			else
			{
				System.out.print("*");
			}
		}
		System.out.println();
		}	
	}
	public static void main(String[] args) {
		Starmissing.Star1();
		Starmissing.Star();
		
	}

}
