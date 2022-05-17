package Oops;

public final class Fkeyword {//final keyword
 final int a=23;
  final String p="Maharashtra";
  
  public final void star(){
	  System.out.println("Pune123");
  }
  public final void star(int a) {
	  System.out.println("Hingoli");
  }
  public static void main(String[] args) {
	Fkeyword obj=new Fkeyword();
	obj.star();
	obj.star(5);
	main();//main method overload
	System.out.println(obj.a);
	System.out.println(obj.p);
	
}
  public static void main() {
	  System.out.println("abcd");
  }
}
