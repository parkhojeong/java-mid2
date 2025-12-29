package collection.link;

public class NodeMain1 {
    public static void main(String[] args) {
        Node node = new Node("1");
        node.next = new Node("2");
        node.next.next = new Node("3");

        Node x = node;
        while (x != null) {
            System.out.println("x.item = " + x.item);
            x = x.next;
        }
    }
}
