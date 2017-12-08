package basicPrograms;

public class TwentyOne {
	
	public static void main(String[] args) {
		System.out.println(absoluteTwentyOne(19));
	}
	
	static int absoluteTwentyOne(int n){
		
		return (n > 21) ?  
				2 * Math.abs(21 - n) : Math.abs(21 -n);
		
		
	}

}
