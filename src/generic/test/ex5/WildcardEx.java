package generic.test.ex5;

import generic.animal.Animal;

public class WildcardEx {

    static <T> void printGenericV1(Box<T> box) {
        System.out.println(box.getValue());
    }

    static void printWildcardV1(Box<?> box) {
        Object obj = box.getValue();
        System.out.println(obj);
    }

    static <T extends Animal> void printGenericV2(Box<T> box) {
        T t = box.getValue();
        System.out.println(t);
        System.out.println(t.getSize());
    }

    static void printWildcardV2(Box<? extends Animal> box) {
        Animal animal = box.getValue();
        System.out.println(animal);
        System.out.println(animal.getSize());
    }

    static <T extends Animal> T printAndReturnGeneric(Box<T> box) {
        T animal = box.getValue();
        System.out.println(animal);
        System.out.println(animal.getSize());
        return box.getValue();
    }

    static Animal printAndReturnWildcard(Box<? extends Animal> box) {
        Animal animal = box.getValue();
        System.out.println(animal);
        System.out.println(animal.getSize());
        return animal;
    }
}
