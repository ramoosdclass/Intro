package introToObjects;

public class Car {

	String color;
	String make;
	int year;
	String model;
	int topSpeed;
	int seatingCapacity;
	double cost;

	void tellMeWhatTypeOfCarIM(int topSpeed) {
		if (topSpeed > 125) {
			System.out.println("I am sports car");
		} else {
			System.out.println("I am not a sports car");
		}

	}

	boolean checkIfLuxuryCar(double cost) {
		if (cost > 45000.00) {
			return true;
		} else {
			return false;
		}
	}

}
