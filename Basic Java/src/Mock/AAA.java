package Mock;

public class AAA {
	public static void addition(int a,int b) {
		System.out.println(a+b);
				}
	public void substraction(int c,int d) {
		System.out.println(c-d);
	}
	public static void main(String[] args) {
	   AAA.addition(10,20);//static variable
	   AAA.addition(40,20);
	
		AAA obj=new AAA();//non static variable
		obj.substraction(30,10);
		obj.substraction(20,10);
	}
	}


