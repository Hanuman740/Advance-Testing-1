package Practice;

public class Printreversenumber {
public static void main(String[]args) {
	int a=123;
	int b=0;
	while(a!=0) {
		int c=a%10;
		b=b*10+c;//0*10+3//3,0*10+2//2,
		a=a/10;
	}
	System.out.println(b);
}

}
