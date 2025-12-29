package generic.test.ex3;

import generic.test.ex3.unit.Marine;
import generic.test.ex3.unit.Zealot;

public class UnitUtilTest {
    public static void main(String[] args) {
        Marine marine1 = new Marine("marine1", 40);
        Marine marin2 = new Marine("marin2", 50);
        Marine marine = UnitUtil.maxHp(marine1, marin2);
        System.out.println("marine = " + marine);

        Zealot zealot = new Zealot("zealot1", 100);
        Zealot zealot2 = new Zealot("zealot2", 150);
        Zealot zealot3 = UnitUtil.maxHp(zealot, zealot2);
        System.out.println("zealot3 = " + zealot3);


    }
}
