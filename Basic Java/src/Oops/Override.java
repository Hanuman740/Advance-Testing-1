package Oops;

public class Override extends Parent{
  public void add(){//method override
	int a=23;
	int b=10;
	int c= a+b;
	System.out.println(c);
	super.add();//method override
    super.add(3);//method override
}
  public void minus() {
	  System.out.println("Hingoli");
	  this.substracte();
  }
 public static void main(String[]args) {
	 Override a=new Override();
	 a.add();
	 a.minus();

 }
 
}
