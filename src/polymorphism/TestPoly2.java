package polymorphism;

public class TestPoly2 {

	public static void main(String[] args) {
		
		Animal cat = new Cat();
		
		Interrogator.makeAnimalTalk(cat);
		
		Dog dog = new Dog();
		Interrogator.makeAnimalTalk(dog);

	}

}
