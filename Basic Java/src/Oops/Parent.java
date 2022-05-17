package Oops;

public class Parent {
public void add(){
	int a=12;
	int b=16;
	int c=a+b;
	System.out.println(c);
}
public void add(int a) {//method overloading
	System.out.println("Hello");
}
public void substracte() {
	int p=23;
	int q=13;
	int r=p-q;
	System.out.println(r);
}

public static void main(String[]args) {
	Parent obj=new Parent();
	obj.add();
	obj.add(2);
	obj.substracte();
	

}
}
