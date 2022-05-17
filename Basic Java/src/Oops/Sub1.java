package Oops;

public class Sub1 extends Parent {//single level inheritance
	public void mul() {
		int s=6;
		int t=5;
		int v=s*t;
		System.out.println(v);
	}
public static void main(String[] args) {
	Sub1 obj=new Sub1();
	obj.mul();
	obj.add();
	obj.add(1);
	obj.substracte();
}
}
