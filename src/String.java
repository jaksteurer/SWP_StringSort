public class String {

	public static void main(java.lang.String[] args) {
		compareTo();
	}
	
	public static void compareTo() {
		 java.lang.String name2 = "Mayer";
		 java.lang.String name1 = "Meier";
		 if(name1.compareTo(name2)>0)
		 {
			 System.out.println(name1 + "\n"+ name2);
		 }
		 else {
			 System.out.println(name2 + "\n"+ name1);
		 }
	}
}
