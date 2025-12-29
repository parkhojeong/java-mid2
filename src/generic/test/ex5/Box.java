package generic.test.ex5;

import generic.animal.Animal;

public class Box<T> {

    T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
