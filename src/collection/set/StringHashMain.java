package collection.set;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class StringHashMain {
    static final int CAPACITY = 10;

    public static void main(String[] args) {
        char chatA = 'A';
        char chatB = 'B';
        System.out.println("chatA = " + (int)chatA);
        System.out.println("chatB = " + (int)chatB);

        System.out.println(hash("A"));
        System.out.println(hash("B"));
        System.out.println(hash("AB"));

        System.out.println("hashIndex(hash(\"A\")) = " + hashIndex(hash("A")));
        System.out.println("hashIndex(hash(\"B\")) = " + hashIndex(hash("B")));
        System.out.println("hashIndex(hash(\"AB\")) = " + hashIndex(hash("AB")));

    }

    static int hash(String key) {
        char[] charArray = key.toCharArray();
        int sum = 0;
        for (char c : charArray) {
            sum += c;
        }
        return sum;
    }

    static int hashIndex(int value) {
        return value % CAPACITY;
    }
}
