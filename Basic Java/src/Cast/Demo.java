package Cast;

public class Demo {
	public static void main(String[] args) {
		String  str="i love coooding";
		getcharcount(str,'o');
	}
	public static void getcharcount (String str, char val) {
		int count = 0;
		for(int i=0;i<str.length();i++){
			if (str.charAt(i)==val) {
				count ++;
				System.out.println(val+" "+count);
			}
		}
	}

}
