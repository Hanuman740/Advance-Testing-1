package Practice;

public class Constructor {
Constructor(){
	System.out.println("Hello this is user defined Constructor");
}
Constructor(int a){
	System.out.println("Parametrized Constructor");
}
public static void main(String[] args) {
	Constructor obj=new Constructor();
    Constructor abc=new Constructor(10);
}
}
 