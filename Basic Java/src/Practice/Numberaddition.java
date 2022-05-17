package Practice;

public class Numberaddition {
	public static void main(String[]args) {
	int a=1234;
	int sum=0;
	int n=0;
	while(a>0) {
		n=a%10;
		sum=sum+n;
		a=a/10;
	}
	System.out.println(sum);
	}

}
