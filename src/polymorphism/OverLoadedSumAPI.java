package polymorphism;

public class OverLoadedSumAPI {
	
	
	public static int sum(int num1, int num2) {
		return num1 + num2;
	}
	
	public static double sum(double num1, double num2) {
		return num1 + num2;
	}
	
	public static int sum(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	
	public static double sum(int num1, double num2) {
		return num1+num2;
	}
	
	public static double sum(double num1, int num2) {
		return num1+num2;
	}

}
