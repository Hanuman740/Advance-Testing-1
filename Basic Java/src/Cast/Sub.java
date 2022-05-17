package Cast;

public class Sub extends Access {
public void test() {//override
	System.out.println("Good Morning");
	super.test();
	this.test2();
}
public static void demo() {
	System.out.println("Method of child class");
}
public static void main(String[] args) {
	Access obj=new Sub();//Upcasting
	obj.test();
	
}
}
