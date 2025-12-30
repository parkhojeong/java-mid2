package collection.list;

public class MyListMain {
    public static void main(String[] args) {
        MyList<Integer> list = new MyArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        System.out.println(list.get(1));

        MyList<Integer> list2 = new MyLinkedList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        System.out.println(list2);
        System.out.println(list2.get(1));
    }
}
