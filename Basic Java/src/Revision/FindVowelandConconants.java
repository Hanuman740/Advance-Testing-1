package Revision;

public class FindVowelandConconants {

public static void main(String[] args) {
	   String name="Hanuman Shinde";
	   int ln =name.length();
	   int nov=0 ;
	   
	    for(int i=0;i<ln;i++) {
	    	char vc=name.charAt(i);
	    	
	    	if(vc=='a'|| vc=='e'||vc=='i'||vc=='o'||vc=='u') {
	    		System.out.print(vc);
	    		nov++;
	    	}
	    }
	    System.out.println(nov);
	   
	}


} 


