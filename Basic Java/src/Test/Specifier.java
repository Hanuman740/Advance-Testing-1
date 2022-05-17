package Test;

import Mock.AccessSpecifier;

public class Specifier extends AccessSpecifier {
	public static void main(String[] args) {
		AccessSpecifier abc=new AccessSpecifier();
		abc.addition();//public
    	//abc.substracte();//private
	   //  abc.multiplication();//default
	      // System.out.println(abc.d);
	 //   System.out.println(abc.e);
		Specifier obj=new Specifier();
		obj.division();//protected
		obj.addition();
	}

}
