package Assignment;

public class Name {
	public static void main(String[] args) {
		int a,b;
		for(a=1;a<=3;a++)
			{
			for(b=1;b<=3;b++)
				{
				if(a==1&&b==2||(a==3&&b==2))
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
}
