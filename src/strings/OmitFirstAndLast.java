package strings;

public class OmitFirstAndLast {
	
	public static void main(String[] args) {
//		String str1= "Hello";
//		System.out.println(str1.substring(1, str1.length()-1));
		System.out.println(removeFirstAndLastChars("Magic"));
	}
	
	
	public static String removeFirstAndLastChars(String str1) {
		return str1.substring(1, str1.length()-1);
	}

}
