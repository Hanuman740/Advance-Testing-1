package Mock;

public class Add {
	public void addition() {
		int a=10;//global variables
		int b=30;
		int c=a+b;
		System.out.println(c);
	}
		public static void main(String[] args) {
			Add obj=new Add ();
			obj.addition();
		}	
	}


