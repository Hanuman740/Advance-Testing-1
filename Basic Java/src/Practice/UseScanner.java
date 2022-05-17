 package Practice;
import java.util.Scanner;
public class UseScanner {
	public static void main(String[] args) {
		Scanner obj =new Scanner(System.in);
		System.out.println("enter the number:- ");
		int num=obj.nextInt();
		int f=1;
				for(int b=1;b<=num;b++) {
					f=f*b;
				}
				System.out.println(f);
	}

}
