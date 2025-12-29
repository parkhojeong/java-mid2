package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV1 {
    public static void main(String[] args) {
        AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
        AnimalHospitalV1 catHospital = new AnimalHospitalV1();

        Dog dog = new Dog("dog1", 100);
        Cat cat = new Cat("cat1", 200);

        dogHospital.set(dog);
        dogHospital.checkup();

        // runtime error
        dogHospital.set(cat);

        catHospital.set(cat);
        catHospital.checkup();

        // type unsafety: down-casting error possible
        Dog largerDog = (Dog) dogHospital.bigger(new Dog("dog2", 200));
        System.out.println("largerDog = " + largerDog);

    }
}
