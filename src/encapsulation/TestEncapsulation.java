package encapsulation;

public class TestEncapsulation {
	
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.setYear(2014);
		car1.setTopSpeed(180);
		car1.setMake("Ford");
		car1.setModel("SRX");
		
		System.out.println("Car1 Details: " + 
		"\n" + car1.getMake() + "\n" + car1.getModel() + 
		"\n" +car1.getYear() + "\n" + car1.getTopSpeed());
		
		Car car2 = new Car();
		car2.setYear(2015);
		car2.setTopSpeed(500);
		car2.setMake("Toyota");
		car2.setModel("Camry");
		
		System.out.println("Car2 Details: " + 
				"\n" + car2.getMake() + "\n" + car2.getModel() + 
				"\n" +car2.getYear() + "\n" + car2.getTopSpeed());
		
	}

}
