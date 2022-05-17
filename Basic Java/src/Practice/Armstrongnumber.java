package Practice;

public class Armstrongnumber {
	public static void main(String[] args) {
		int num=153;//1*1*1+5*5*5+3*3*3=153//1+125+27=  153
		int a=num;
		int b=0;
		int c;
		while(a!=0) {
			c=a%10;//3//5//1
			b=b+(c*c*c);//27//152//153
			a=a/10;//15//1//0
			System.out.println(b);
		}
		if(b==num) {
			System.out.println("It is a Armstrong Number");
		}
		else {
			System.out.println("It is not a Armstrong Number");
		}
	}

}
