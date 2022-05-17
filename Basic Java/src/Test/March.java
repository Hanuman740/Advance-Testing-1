package Test;
import Oops.New;
public class March implements New {
	public void demo() {
		System.out.println("Hi");
	}
	public void demo2() {
		System.out.println("Hey");
	}
public static void main(String[] args) {
	March k=new March();
	k.demo();
	k.demo2();
	System.out.println(k.a);
}
}
