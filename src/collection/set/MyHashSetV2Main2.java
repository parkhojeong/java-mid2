package collection.set;

import collection.set.member.Member;

public class MyHashSetV2Main2 {
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);
        Member id1 = new Member("hi");
        Member id2 = new Member("JPA");
        Member id3 = new Member("java");
        Member id4 = new Member("spring");

        System.out.println("id1.hashCode() = " + id1.hashCode());
        System.out.println("id2.hashCode() = " + id2.hashCode());
        System.out.println("id3.hashCode() = " + id3.hashCode());
        System.out.println("id4.hashCode() = " + id4.hashCode());

        set.add(id1);
        set.add(id2);
        set.add(id3);
        set.add(id4);
        System.out.println(set);

        Member searchValue = new Member("JPA");
        boolean result = set.contains(searchValue);
        System.out.println("result = " + result);

    }
}
