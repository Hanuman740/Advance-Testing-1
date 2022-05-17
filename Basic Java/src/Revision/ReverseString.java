package Revision;

public class ReverseString {
public static void main(String[] args) {
	String a="1254Automationfor is best for Testing";
	String b="Class";
	a=a.replaceAll(" ", "");
	a=a.replaceAll("[0-9]", "");
	StringBuilder builder=new StringBuilder(a);
	builder.append(b);
	builder.reverse();
	System.out.println(builder);
}

}
