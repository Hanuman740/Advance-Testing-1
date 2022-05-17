package Practice;

public class variables {
	int a=10;//global
	int b=12;//
	public void addition() {
		int c=a+b;
		System.out.println(c);
		int d=c+a;
		System.out.println(d);
	}
	public void substracte() {
		int d=a-b;
		System.out.println(d);
	}
	public static void main(Nonprimitive[] args) {
		
		variables abc= new variables();
		abc.addition();
		abc.substracte();
	}

}
