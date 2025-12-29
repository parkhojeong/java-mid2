package generic.test.ex3;


import generic.test.ex3.unit.BioUnit;

public class UnitPrinter {
    static <T extends BioUnit> void printV1(Shuttle<T> shuttle) {
        T unit = shuttle.getUnit();
        System.out.println(unit.getName() + " " + unit.getHp());
    }

    static void printV2(Shuttle<?> shuttle) {
        BioUnit unit = shuttle.getUnit();
        System.out.println(unit.getName() + " " + unit.getHp());
    }
}
