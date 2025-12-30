package collection.set;

import collection.set.member.Member;

public class MyHashSetV3Main {
    public static void main(String[] args) {
        MyHashSetV3<String> set = new MyHashSetV3(10);
        set.add("A");
        set.add("B");
        set.add("C");
        System.out.println(set);

        System.out.println(set.contains("A"));
        System.out.println(set.contains("X"));
    }
}
