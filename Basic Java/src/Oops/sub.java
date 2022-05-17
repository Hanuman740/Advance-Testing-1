 package Oops;

public class sub extends Incomplete {
public void test2() {
	System.out.println("Completed");
}
public void test() {
	System.out.println("Maharashtra");
}
public void demo() {
	System.out.println("Hey");//abstract method from incomplete class
}
public void demo2() {
	System.out.println("Good Morning");//abstract method from incomplete class
}
public static void main(String[]args) {
	sub obj=new sub();
	obj.test();
	obj.test2();
	
}
}
 