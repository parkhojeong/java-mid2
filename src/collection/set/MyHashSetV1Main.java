package collection.set;

public class MyHashSetV1Main {
    public static void main(String[] args) {
        MyHashSetV1 buckets = new MyHashSetV1(10);
        buckets.add(1);
        buckets.add(2);
        buckets.add(3);
        buckets.add(4);
        buckets.add(5);
        buckets.add(15);
        buckets.add(35);
        System.out.println(buckets);

        System.out.println("buckets.contains(3) = " + buckets.contains(5));
        System.out.println("buckets.contains(99) = " + buckets.contains(55));

        System.out.println("remove = " + buckets.remove(4));
        System.out.println(buckets);

    }
}
