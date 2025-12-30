package collection.set;

public class MyHashSetV2Main1 {
    public static void main(String[] args) {
        MyHashSetV2 setV2 = new MyHashSetV2(10);
        setV2.add("A");
        setV2.add("B");
        setV2.add("C");
        setV2.add("D");
        setV2.add("AB");
        setV2.add("SET");
        System.out.println(setV2);

        System.out.println("\"A\".hashCode() = " + "A".hashCode());
        System.out.println("\"B\".hashCode() = " + "B".hashCode());
        System.out.println("\"AB\".hashCode() = " + "AB".hashCode());
        System.out.println("\"SET\".hashCode() = " + "SET".hashCode());

        System.out.println(setV2.contains("A"));
        System.out.println(setV2.contains("B"));
        System.out.println(setV2.contains("C"));
        System.out.println(setV2.contains("D"));
        System.out.println(setV2.contains("AB"));
        System.out.println(setV2.contains("SET"));
        System.out.println(setV2.contains("X"));
    }
}
