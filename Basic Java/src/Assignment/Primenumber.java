package Assignment;

public class Primenumber {
	public static void main(String[]args) {
		int a=17;
		int z=0;
		for(int i=2;i<a;i++) {
			if(a%i==0) 
			{
		        z++;
			}
			}
			if(z==0) {
				System.out.println("it is a prime Number");
			}
			else {
				System.out.println("not a prime Number");
			}
		}
				
	}

 