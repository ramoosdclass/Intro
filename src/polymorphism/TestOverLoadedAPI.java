package polymorphism;

public class TestOverLoadedAPI {
	
	public static void main(String[] args) {
		System.out.println("Adding three integers " + 
	OverLoadedSumAPI.sum(1, 2, 3));
		
		System.out.println("Adding two doubles " + 
				OverLoadedSumAPI.sum(1.1, 2.2));
	}

}
