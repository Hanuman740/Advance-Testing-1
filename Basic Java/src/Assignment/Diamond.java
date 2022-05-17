package Assignment;

public class Diamond {
		public static void pyra() {
		int a,b,c;
		for(a=1;a<=5;a++)//row 5
		{
			for(b=a;b<5;b++)//5
	 		{
			System.out.print(" ");
			}
			for(c=1;c<=a;c++)//1
			{
			System.out.print(" *");
			}
			System.out.println(" ");
		   }
	      for(a=1;a<=5;a++)
	      {
		 for(b=5;b>5-a;b--)
		 {
	 	System.out.print(" ");
		}
	 	for(c=2;c<=b+1;c++)
		{
		System.out.print(" *");
		}
		System.out.println(" ");
	}
	}	

		public static void main(String[] args) {
			Diamond.pyra();
					
			}	
		}

			
		

