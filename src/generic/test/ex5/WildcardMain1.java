package generic.test.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain1 {
    public static void main(String[] args) {

        Box<Object> objectBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        dogBox.setValue(new Dog("dog1", 100));
        WildcardEx.printGenericV1(dogBox);
        WildcardEx.printGenericV2(dogBox);
        WildcardEx.printAndReturnGeneric(dogBox);
        WildcardEx.printWildcardV1(dogBox);
        WildcardEx.printWildcardV2(dogBox);
        Animal animal = WildcardEx.printAndReturnWildcard(dogBox);
        System.out.println(animal);
    }
}
