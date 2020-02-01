import lv.dita.polymorphism.Animal;
import lv.dita.polymorphism.Cat;
import lv.dita.polymorphism.Dog;

public class TestPolyMorphism {

	public static void main(String[] args) {
		Animal myAnimal = new Animal();
		Animal myDog = new Dog();
		Animal myCat = new Cat();

		myDog.animalSound();
		myCat.animalSound();
		myAnimal.animalSound();

	}

}
