package generic.test.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain2 {
    public static void main(String[] args) {
        Box<Object> objectBox = new Box<>();
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        writeBox(objectBox);
        writeBox(animalBox);

        // compile error
        // writeBox(dogBox);
        // writeBox(catBox);
    }

    static void writeBox(Box<? super Animal> box) {
        box.setValue(new Dog("dog1", 100));
    }
}
