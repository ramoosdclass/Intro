package strings;

public class StringSandwich {

	public static void main(String[] args) {
		System.out.println(makeMeASandwich("||||", "tomato"));

	}
	
	public static String makeMeASandwich(String bread, String filling) {
		return bread.substring(0, 2) + filling + bread.substring(2, 4);
	}
	

}
