package Mock;

public class Access {
	public static void main(String[] args) {
		AccessSpecifier obj=new AccessSpecifier();
		obj.addition();//public
		//obj.subtract();//private
		obj.multiplication();//default
		obj.division();//protected
		System.out.println(obj.d);//public
		System.out.println(obj.e);//default
	}

}
