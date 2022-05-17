package Mock;

public class Constructors {
public Constructors() {
	System.out.println("IBM");
}
public Constructors(int a) {
	System.out.println("Google");
}
public Constructors(String p,int a) {
	System.out.println("HCL");
}
public static void main(String[] args) {
	Constructors t=new Constructors();
	Constructors r= new Constructors(3);
	Constructors q= new Constructors("Pune",3);
	
}
}
