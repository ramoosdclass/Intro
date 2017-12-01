package introToObjects;

public class CarApplication {

	public static void main(String[] args) {
		
		
		Car car1 = new Car();
		
		Car car2 = new Car();
		
		car1.topSpeed = 80;
		car1.cost = 35000;
		car1.color = "blue";
		car1.make = "Honda";
		car1.model ="Accord";
		
		car2.topSpeed = 180;
		car2.cost = 85000;
		car2.color = "blue";
		car2.make = "Honda";
		car2.model = "nsx";
		
		System.out.println(car1.make + " " + car1.model + " " + car1.color);
		car1.tellMeWhatTypeOfCarIM(car1.topSpeed);
		System.out.println(car2.make + car2.model + car2.color);
		car2.tellMeWhatTypeOfCarIM(car2.topSpeed);
		

	}

}
