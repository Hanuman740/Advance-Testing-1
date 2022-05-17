package Mock;

public class CCC {
	public void triangle(int i) {
		for(int a = 1;a<=i;a++){
			for(int b=1; b<=a;b++) {
				System.out.println(" *");
			}
			System.out.println();
		}
	}
public static void main(String[]args) {
	CCC obj = new CCC();
	obj.triangle(3);
	obj.triangle(4);
}
}
