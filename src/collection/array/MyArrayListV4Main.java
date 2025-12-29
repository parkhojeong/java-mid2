package collection.array;

public class MyArrayListV4Main {
    public static void main(String[] args) {
        MyArrayListV4<Integer> list = new MyArrayListV4<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Integer integer = list.get(0);
        System.out.println("integer = " + integer);
        System.out.println("list = " + list);

        MyArrayListV4<String> list2 = new MyArrayListV4<>();
        list2.add("a");
        list2.add("b");
        list2.add("c");
        String string = list2.get(0);
        System.out.println("string = " + string);
        System.out.println("list2 = " + list2);

    }
}
