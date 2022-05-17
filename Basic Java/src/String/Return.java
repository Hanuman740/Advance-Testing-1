package String;

public class Return {
public int addition(int a,int b) {//The return type is int means method will return int value
	int c=a+b;
	return c;//will return mentioned value
}
public static String name() {
	String a="Velocity";
	System.out.println(a);
	return a;
	
}
public static void main(String[]args) {
	Return obj=new Return();
	int d=obj.addition(40,50);//addition method return a int value which is stored in new int for use
	System.out.println(d);
	System.out.println(d*2);
	System.out.println(d-20);
	System.out.println(d+20);
	System.out.println(d/15);

	Return.name();
 
	
}
}
