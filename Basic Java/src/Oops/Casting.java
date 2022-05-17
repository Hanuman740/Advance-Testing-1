package Oops;

public class Casting {
public static void main(String[]args) {
	byte a=20;//size 1byte
	System.out.println(a);
	int b=a;//implicite//size 4 byte
	System.out.println(b);
	
	double c=b;//implicite//size 8 byte
	System.out.println(c);
	
	double f=15.75;//size 8 byte
	System.out.println(f);
	int i=(int)f;//explicite//int size 4 byte
	System.out.println(i);
	
	byte x=(byte)i;//size 1 byte
	System.out.println(x);
	}
}
