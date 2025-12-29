package generic.test.ex3;

import generic.test.ex3.unit.Marine;
import generic.test.ex3.unit.Zealot;
import generic.test.ex3.unit.Zergling;

public class UnitPrinterTest {
    public static void main(String[] args) {
        Shuttle<Marine> shuttle1 = new Shuttle<>();
        shuttle1.in(new Marine("marine1", 40));

        Shuttle<Zergling> shuttle2 = new Shuttle<>();
        shuttle2.in(new Zergling("zergling1", 10));

        Shuttle<Zealot> shuttle3 = new Shuttle<>();
        shuttle3.in(new Zealot("zealot1", 100));

        UnitPrinter.<Marine>printV1(shuttle1);
        UnitPrinter.printV2(shuttle1);

        UnitPrinter.<Zergling>printV1(shuttle2);
        UnitPrinter.printV2(shuttle2);

        UnitPrinter.<Zealot>printV1(shuttle3);
        UnitPrinter.printV2(shuttle3);
    }
}
