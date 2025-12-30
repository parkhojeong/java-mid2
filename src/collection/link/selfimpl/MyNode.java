package collection.link.selfimpl;

public class MyNode<T> {
    T item;
    MyNode<T> next;

    public MyNode(T item) {
        this.item = item;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        MyNode<T> x = this;
        sb.append("[");
        while (x != null) {
            sb.append(x.item);
            if( x.next != null) {
                sb.append("->");
            }
            x = x.next;
        }
        sb.append("]");
        return sb.toString();

    }
}
