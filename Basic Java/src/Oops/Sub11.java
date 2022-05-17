package Oops;

public class Sub11 extends Sub1 {//multi level inheritance
	public void div() {
		int x=45;
		int y=5;
		int z=x/y;
		System.out.println(z);
	}
	public static void main(String[] args) {
		Sub11 obj=new Sub11();
		obj.div();
		obj.mul();
		obj.add();
		obj.substracte();
	}

}
