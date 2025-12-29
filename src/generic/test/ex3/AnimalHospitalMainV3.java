package generic.test.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV3 {
    public static void main(String[] args) {
        AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3<>();
        AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3<>();

        Dog dog = new Dog("dog1", 100);
        Cat cat = new Cat("cat1", 200);

        dogHospital.set(dog);
        dogHospital.checkup();

        // compile error
        // dogHospital.set(cat);

        catHospital.set(cat);
        catHospital.checkup();

        Dog largerDog = dogHospital.bigger(new Dog("dog2", 200));
        System.out.println("largerDog = " + largerDog);

    }
}
