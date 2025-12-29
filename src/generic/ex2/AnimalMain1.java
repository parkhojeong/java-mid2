package generic.ex2;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalMain1 {
    public static void main(String[] args) {
        Animal animal = new Animal("animal", 0);
        Dog dog = new Dog("dog", 1);
        Cat cat = new Cat("cat", 2);

        Box<Dog> dogBox = new Box<>();
        dogBox.setValue(dog);
        Dog dog1 = dogBox.getValue();
        System.out.println("dog1 = " + dog1);

        Box<Animal> animalBox = new Box<>();
        animalBox.setValue(animal);
        Animal animal1 = animalBox.getValue();
        System.out.println("animal1 = " + animal1);

        Box<Cat> catBox = new Box<>();
        catBox.setValue(cat);
        Cat cat1 = catBox.getValue();
        System.out.println("cat1 = " + cat1);
    }
}
