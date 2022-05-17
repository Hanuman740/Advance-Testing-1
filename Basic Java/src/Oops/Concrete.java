package Oops;

public class Concrete extends sub {
	public void demo() {
		System.out.println("Hey");//abstract method from incomplete class
	}
	public void demo2() {
		System.out.println("Good Morning");//abstract method from incomplete class
	}
	public static void main(String[]args) {
		Concrete obj= new Concrete();
		obj.test();//method from sub class
		obj.test2();//method from sub class
		obj.demo();
		obj.demo2();
	}

}
