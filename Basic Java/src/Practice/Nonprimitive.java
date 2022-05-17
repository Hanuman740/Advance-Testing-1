package Practice;

public class Nonprimitive {
	public static void main(String[]args ) {
		String name="     THIS IS MY JAVA CODE   ";
		String position="THIS IS MY java CODE";
		System.out.println(name);
		System.out.println(position);
		System.out.println(name.charAt(5));
		System.out.println(name.length());
		System.out.println(position.length());
		System.out.println(position.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.concat(position));
		System.out.println(name.substring(0,6));
		System.out.println(position.equalsIgnoreCase(name));//lower,upper case ignore
		System.out.println(name.contains(position));//same content
		System.out.println(name.indexOf('Y'));
		System.out.println(name.trim());
		System.out.println(position.replace(" ","*"));
		System.out.println(name.replace(" ",""));
	}

}
