package String;

public class String1 {
	public static void main(String[]args) {
		String a="shree123$%#";
		a=a.replaceAll("[0-9]","");
		a=a.replaceAll("[$%#]","");
		System.out.println(a);
	}
}
