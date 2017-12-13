package abstraction;

public abstract class Device {
	
	public void turnOn(){
		System.out.println("Turn on a device");	
	}
	
	public void turnOff(){
		System.out.println("Turn of a device");	
	}
	
	public abstract void run();

}
