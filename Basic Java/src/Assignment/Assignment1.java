package Assignment;

public class Assignment1 {
	public void Assi() {
	int a;
	int b;
	for(a=1; a<=5; ++a)
	{
		for(b=1;b<=a;++b)
		{
			System.out.print(" *");
		}
		System.out.println();
	}
	for(a=4;a>=1;--a)
	{
		for(b=1;b<=a;++b)
	{
		System.out.print(" *");
       }
  	System.out.println();
		}
		}
	public static void main(String[] args) {
		Assignment1 obj=new Assignment1();
		obj.Assi();
		obj.Assi();
	}
	}
		
	

