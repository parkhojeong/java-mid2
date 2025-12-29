package collection.link;

public class NodeMain3 {
    public static void main(String[] args) {
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        // scan all nodes
        printAll(first);

        // search last node
        System.out.println("====");
        Node lastNode = getLastNode(first);
        System.out.println("lastNode = " + lastNode);

        // search index node
        System.out.println("====");
        Node findNode = getNode(first, 2);
        System.out.println("findNode.item: " + findNode.item);

        System.out.println("====");
        add(first, "D");
        System.out.println(first);
        add(first, "E");
        System.out.println(first);
    }

    private static void add(Node first, String d) {
        getLastNode(first).next = new Node(d);
    }

    private static Node getNode(Node first, int index) {
        Node node = first;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    private static Node getLastNode(Node first) {
        Node node = first;
        while (node.next != null) {
            node = node.next;
        }
        return node;
    }

    private static void printAll(Node first) {
        Node node = first;
        while (node != null) {
            System.out.println(node.item);
            node = node.next;
        }
    }
}
