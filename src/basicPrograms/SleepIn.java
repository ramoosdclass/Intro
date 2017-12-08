package basicPrograms;

public class SleepIn {
	
	public static void main(String[] args) {
		System.out.println("Should I Sleep: " +
	checkIfIShouldSleepIn(true, true));
	}
	
	
	static boolean checkIfIShouldSleepIn(boolean weekday,
			boolean vacation) {
		if(!weekday || vacation) {
			return true;
		}
		else {
			return false;
		}
	}

}
