package Practice;

import Assignment.Diamond;
import Assignment.Starmissing;
import Mock.AccessSpecifier;

public class Methodcall {
public void Hey() {
	for(int a=1;a<=5;a++) {
		for(int b=1;b<=a;b++) {
			System.out.print(" *");
		}
		System.out.println();
	}
}
public static void main(Nonprimitive[]args) {
	Methodcall obj=new Methodcall();//Non Static
	obj.Hey();
	Diamond abc=new Diamond();//Non Static
	abc.pyra();
	Starmissing.Star();//Static Method
	AccessSpecifier pqr= new AccessSpecifier();//Non Static
	pqr.addition();
    }

}
