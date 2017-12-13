package polymorphism;

public class TestPolymorphism {
	
	public static void main(String[] args) {
		
		System.out.println("Processing payments for Dev:");
		Employee emp1 = new Developer();
		emp1.pay();
		emp1.bonus();
		
		
		System.out.println("Processing payments for SalesPerson:");
		Employee emp2 = new SalesPerson();
		emp2.pay();
		emp2.bonus();
		
		
		System.out.println("Processing payments for clerk:");
		Employee emp3 = new Clerk();
		emp3.pay();
		emp3.bonus();
	}

}
