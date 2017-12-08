package encapsulation;

public class Car {

	private int year;
	private String make;
	private String model;
	private String color;
	private int topSpeed;

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getMake() {
		return make;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setTopSpeed(int topSpeed) {
		if(topSpeed < 300) {
		this.topSpeed = topSpeed;
	}
	}

	public int getTopSpeed() {
		return topSpeed;
	}

}
