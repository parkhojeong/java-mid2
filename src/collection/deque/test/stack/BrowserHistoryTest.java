package collection.deque.test.stack;

public class BrowserHistoryTest {
    public static void main(String[] args) {
        BrowserHistory browserHistory = new BrowserHistory();

        browserHistory.visitPage("youtube");
        browserHistory.visitPage("google");
        browserHistory.visitPage("facebook");

        String page1 = browserHistory.goBack();
        System.out.println("page1 = " + page1);

        String page2 = browserHistory.goBack();
        System.out.println("page2 = " + page2);

    }
}
