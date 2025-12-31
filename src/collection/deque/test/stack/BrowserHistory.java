package collection.deque.test.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {
    Deque<String> history = new ArrayDeque<>();
    private String currentPage;

    public void visitPage(String page) {
        if(currentPage != null){
            history.push(currentPage);
        }
        currentPage = page;
    }

    public String goBack() {
        if(history.isEmpty()) return currentPage;

        currentPage = history.pop();
        return currentPage;
    }
}
