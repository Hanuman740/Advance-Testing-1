package String;

public class CompareString {

	public static void main(String[] args) {
		String a="Pune is best City";
		String b="Chhatrapati Shambhajinagar";
		int c=a.length();
		System.out.println(c);
		int d=b.length();
		System.out.println(d);
		
		int size=b.compareTo(a);
		System.out.println(size);
	}

}
 