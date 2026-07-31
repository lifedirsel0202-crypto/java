package chapter7.test;

public class AnimalExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("------------");
		
		Animal animal=null;
		animal=new Dog();
		animal.sound();
		
		animal = new Cat();
		animal.sound();
		System.out.println("--------------");
		
		
		animalSond(new Dog());
		
		animalSond(new Cat());
	}
	
	public static void animalSond(Animal animal) {
		animal.sound();
		
	}
			
}
