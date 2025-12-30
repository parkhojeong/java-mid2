package collection.link;

public class MyLinkedListV2Main {
    public static void main(String[] args) {
        MyLinkedListV2 list = new MyLinkedListV2();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        System.out.println("add first");
        list.add(0, "d"); //O(1)
        System.out.println(list);

        System.out.println("remove first");
        list.remove(0); // O(1)
        System.out.println(list);

        System.out.println("add mid");
        list.add(1, "e"); //O(n)
        System.out.println(list);

        System.out.println("remove mid");
        list.remove(1);
        System.out.println(list);

    }

}
