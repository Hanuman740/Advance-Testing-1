package Practice;

public class ReverseString {
	public static void main(String []args) {
		String name="pune is the best city";
		int size= name.length();
			for(int a=size-1;a>=0;a--)
			{ 
				char b= name.charAt(a);
				if(b!=' ')
				{
				System.out.print(b);
			}
		}
	}
}	
 
