package Assignment;

public class Invertedtrapezoid {
public static void main(String[] args) {
	int a,b,c;
	for(a=1;a<=5;a++)
	{
	    // if(a<5)
		{
		for(b=9;b>=10-a;b--)//b>=5//4
		{
			System.out.print(" ");
		}
		for(c=1;c<=b+1;c++)//c<=5
		{
			System.out.print("* ");
		}
		System.out.println();
	}
}
}
}