package String;

public class Duplicatestring {
public static void main(String[] args) {
	String name[]= {"java","python","c+","c++","java","python"};
	for(int i=0;i<name.length;i++) {
	for(int j=i+1;j<name.length;j++) {
		if(name[i].equals(name[j])) {
			System.out.println("Duplicate element#"+name[j]);
		}
	}
	}
}
}
