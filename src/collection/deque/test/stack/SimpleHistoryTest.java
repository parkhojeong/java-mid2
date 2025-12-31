package collection.deque.test.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class SimpleHistoryTest {
    public static void main(String[] args) {
        Deque<String> history = new ArrayDeque<>();

        history.push("youtube");
        history.push("google");
        history.push("facebook");
        System.out.println(history.pop());
        System.out.println(history.pop());
        System.out.println(history.pop());

    }
}
