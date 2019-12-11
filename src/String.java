import java.util.Arrays;

public class String {

	public static void main(String[] args) {
		compareTo();
	}
	
	public static void compareTo() {
		 java.lang.String name2 = "Mayer";
		 java.lang.String name1 = "Meier";
		 name1.toLowerCase();
		 name2.toLowerCase();
		 if(name1.compareTo(name2)>0)
		 {
			 System.out.println(name1 + " "+ name2);
		 }
		 else {
			 System.out.println(name2 + " "+ name1);
		 }
	}
}
