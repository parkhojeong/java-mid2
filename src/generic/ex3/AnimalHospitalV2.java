package generic.ex3;

public class AnimalHospitalV2<T> {
    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public T get() {
        return animal;
    }

    public void checkup() {
        // only Object method possible
        animal.toString();
        animal.equals(null);

//        System.out.println(animal.getName());
//        System.out.println(animal.getSize());
//        animal.sound();
    }

    public T bigger(T target) {
//        return animal.getSize() > target.getSize() ? animal : target;
        return null;
    }

}
