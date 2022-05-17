package Mock;

public class Lovesymbol {
	public static void main(String[] args) {
		int a,b;
		for(a=1;a<=6;a++)
		{
			for(b=1;b<=7;b++)
			{
				if((a==1&&b==2)||(a==1&&b==6)||(a==2&&b==1)||(a==2&&b==3)||(a==2&&b==5)||(a==2&&b==7)||(a==3&&b==1)||(a==3&&b==4)||(a==3&&b==7)||(a==4&&b==2)||(a==4&&b==6)||(a==5&&b==3)||(a==5&&b==5)||(a==6&&b==4))
				{
				System.out.print(" *");	
				}
				else
				{
				System.out.print("  ");	
				}
			}
			System.out.println();
		
		}
		
	}

}
