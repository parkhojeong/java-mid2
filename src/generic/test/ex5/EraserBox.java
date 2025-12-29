package generic.test.ex5;

import generic.animal.Animal;

public class EraserBox<T> {

    public void isInstanceOf(Object obj) {
        // compile error: obj instanceof Object
        // return obj instanceof T;
    }

    public void create() {
        // compile error
        // new T();
    }
}
