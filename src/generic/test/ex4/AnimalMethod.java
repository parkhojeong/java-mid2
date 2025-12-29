package generic.test.ex4;

import generic.animal.Animal;

public class AnimalMethod {
    public static <T extends Animal> void checkup(T animal) {
        System.out.println(animal.getName());
        System.out.println(animal.getSize());
        animal.sound();
    }

    public static <T extends Animal> T bigger(T animal, T target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
