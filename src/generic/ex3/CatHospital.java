package generic.ex3;

import generic.animal.Cat;

public class CatHospital {
    public Cat animal;

    public void set(Cat animal) {
        this.animal = animal;
    }

    public void checkup() {
        System.out.println(animal.getName());
        System.out.println(animal.getSize());
        animal.sound();
    }

    public Cat bigger(Cat target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
