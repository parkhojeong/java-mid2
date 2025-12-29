package generic.test.ex4;

import generic.animal.Animal;

public class ComplexBox<T extends Animal> {

    T animal;

    public void setAnimal(T animal) {
        this.animal = animal;
    }

    <T> T call(T t){
        System.out.println(animal.getClass().getName());
        System.out.println(t.getClass().getName());
        return t;
    }
}
