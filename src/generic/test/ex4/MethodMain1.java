package generic.test.ex4;

public class MethodMain1 {
    public static void main(String[] args) {
        Integer i = 10;
        Object object = GenericMethod.objMethod(i);

        Integer integer1 = GenericMethod.<Integer>genericMethod(i);
        Integer integer2 = GenericMethod.<Integer>numberMethod(10);
        Double aDouble1 = GenericMethod.<Double>numberMethod(10.0);

        // type parameter inference
        Integer integer3 = GenericMethod.genericMethod(i);
        Integer integer4 = GenericMethod.numberMethod(10);
        Double aDouble2 = GenericMethod.numberMethod(10.0);
    }
}
