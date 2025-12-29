package collection.array;

public class MyArrayListV3BadMain {
    public static void main(String[] args) {
        MyArrayListV3 list = new MyArrayListV3();
        list.add(1);
        list.add(2);
        list.add("string3");
        System.out.println("list = " + list);
    }
}
