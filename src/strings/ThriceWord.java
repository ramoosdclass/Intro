package strings;

public class ThriceWord {
	
	public static void main(String[] args) {
		printFirstTwoCharsThreeTimesLisaWay("BLAH");
		System.out.println(printFirstTwoCharsThreeTimes("BLAH"));
	}
	
	
	
	public static String printFirstTwoCharsThreeTimes(String str1) {
		return str1.substring(0, 2) +
				str1.substring(0, 2) +
				str1.substring(0, 2);
	}
	
	public static void printFirstTwoCharsThreeTimesLisaWay(String str1) {
		for(int i=0; i<3; i++) { 
		System.out.println(str1.substring(0, 2));
		}
	}

}
