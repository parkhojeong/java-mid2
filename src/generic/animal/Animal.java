package generic.animal;

public class Animal {
    private String name;
    private int size;

    public Animal(String name, int age) {
        this.name = name;
        this.size = age;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public void sound() {
        System.out.println("Animal.sound");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + size +
                '}';
    }
}
