package generic.ex1;

public class BoxMain1 {
    public static void main(String[] args) {
        IntegerBox integerBox = new IntegerBox();
        integerBox.set(10); // auto-boxing
        System.out.println(integerBox.get());

        StringBox stringBox = new StringBox();
        stringBox.set("Hello");
        System.out.println(stringBox.get());
    }
}
