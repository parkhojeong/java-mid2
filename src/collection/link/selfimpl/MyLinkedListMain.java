package collection.link.selfimpl;

public class MyLinkedListMain {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList();
        System.out.println(list);
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        System.out.println("list.size() = " + list.size());
        System.out.println("list.get(1) = " + list.get(1));
        System.out.println("list.indexOf(\"c\") = " + list.indexOf("c"));
        System.out.println("list.set(2, \"z\") = " + list.set(2, "z"));
        System.out.println(list);

        list.add("d");
        list.add("e");
        System.out.println(list);

        MyNode<String> remove = list.remove(2);
        System.out.println("remove = " + remove);
        System.out.println(list);
        System.out.println("list.size() = " + list.size());
    }
}
