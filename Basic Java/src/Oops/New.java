package Oops;

public interface New  {
int a=23;//by default public static final

 void demo();
 void demo2();//non static method are by default incomplete and public
 
 public static void demo3() {
	System.out.println("Pune");
	}
 public static void main(String[] args) {
	System.out.println(New.a);
	New.demo3();
}
}

