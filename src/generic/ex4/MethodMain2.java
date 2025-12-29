package generic.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog("dog1", 100);
        Cat cat = new Cat("cat1", 200);

        AnimalMethod.checkup(dog);
        AnimalMethod.checkup(cat);

        Dog dog1 = new Dog("dog2", 200);
        Dog bigger = AnimalMethod.bigger(dog, dog1);
        System.out.println(bigger);
    }
}
