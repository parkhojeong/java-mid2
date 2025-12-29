package generic.test.ex3;

import generic.test.ex3.unit.BioUnit;

public class Shuttle <T extends BioUnit> {
    private T unit;

    void in(T unit){
        this.unit = unit;
    }

    public T getUnit() {
        return unit;
    }

    void showInfo() {
        System.out.println(unit);
    }
}
