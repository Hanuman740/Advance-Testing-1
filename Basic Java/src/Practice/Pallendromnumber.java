package Practice;

public class Pallendromnumber {
	public void Pall() {
	int a=33533;
	int b=a;
	int c=0;
	int d;
	while(b>0){
		d=b%10;//1
		c=c*10+d;//1
		b=b/10;
	}
	if(c==a) {
		System.out.println("Pallendrom Number");
		}
	else {
		System.out.println("It is not a Pallendrom Number");
	}
	}
	public static void main(String[] args) {
		Pallendromnumber obj=new Pallendromnumber();
		obj.Pall();
	}
}

