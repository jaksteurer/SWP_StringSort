import java.util.Arrays;

public class String {

	public static void main(String[] args) {
		compareTo();
	}
	
	public static void compareTo() {
		 String[] names = new String [20];
		 names[0] = "Meier";
		 names[1] = "Mayer";
		 Arrays.sort(names);
		 System.out.println(Arrays.toString(names));
	}
}
