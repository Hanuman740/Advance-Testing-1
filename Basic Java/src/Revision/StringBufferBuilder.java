package Revision;

public class StringBufferBuilder {

	public static void main(String[] args) {
		StringBuilder builder=new StringBuilder("Velocity");
		StringBuffer buffer=new StringBuffer("katraj");
		
	String s="Hello";
	StringBuilder build=new StringBuilder(s);//converting a string to a stringbuilder
	System.out.println(build.reverse());
	
	System.out.println(s.concat("all"));
	System.out.println(builder.append("class"));
	
	System.out.println(s);
	System.err.println(builder);
	}
}
