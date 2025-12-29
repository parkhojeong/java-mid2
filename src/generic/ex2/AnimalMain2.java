package generic.ex2;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalMain2 {
    public static void main(String[] args) {
        Animal animal = new Animal("animal", 0);
        Dog dog = new Dog("dog", 1);
        Cat cat = new Cat("cat", 2);

        Box<Animal> animalBox = new Box<>();
        animalBox.setValue(dog);
        animalBox.setValue(animal);
        animalBox.setValue(cat);
        Animal value = animalBox.getValue();
        System.out.println("value = " + value);
    }
}
