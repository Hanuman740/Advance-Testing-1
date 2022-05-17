package Mock;
public class AccessSpecifier {
   int d=15;//global variables
   int e=12;//global variables
   int c;
   
public void addition() {//public
	int a=10;
	int b=30;
	 c=d+e;
	System.out.println(c);
}
private void subtract() {//private
	int x=45;
	int y=15;
	 c=d-e;
	System.out.println(c);
}
void multiplication() {//default
	int p=4;
	int q=5;
	 c=d*e;
	System.out.println(c);
}
protected void division() {//protected
	int l=20;
	int m=4;
	 c=d/e;;
	System.out.println(c);
}

public static void main(String[] args) {
	AccessSpecifier obj= new AccessSpecifier();
	obj.addition();
	obj.subtract();
	obj.multiplication();
	obj.division();
	System.out.println(obj.d);
	System.out.println(obj.e);
}
}
