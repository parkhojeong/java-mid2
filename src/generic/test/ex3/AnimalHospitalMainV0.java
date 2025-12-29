package generic.test.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV0 {
    public static void main(String[] args) {
        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();

        Dog dog = new Dog("dog1", 100);
        Cat cat = new Cat("cat1", 200);

        dogHospital.set(dog);
        dogHospital.checkup();

        catHospital.set(cat);
        catHospital.checkup();

        Dog largerDog = dogHospital.bigger(new Dog("dog2", 200));
        System.out.println("largerDog = " + largerDog);

    }
}
