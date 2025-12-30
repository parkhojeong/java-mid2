package collection.link.selfimpl;

public class MyLinkedList<T> {
    private MyNode<T> first;
    private int size;

    public void add(T e) {
        MyNode<T> newNode = new MyNode<>(e);
        if (size == 0) {
            first = newNode;
        }else{
            findNode(size - 1).next = newNode;
        }

        size++;
    }

    public void add(int index, T e) {
        MyNode<T> newNode = new MyNode<>(e);
        if (index == 0) {
            first = newNode;
        } else {
            MyNode<T> indexNode = findNode(index);
            MyNode<T> indexBeforeNode = findNode(index - 1);
            newNode.next = indexNode;
            indexBeforeNode.next = newNode;
        }
        size++;
    }

    public MyNode<T> remove(int index) {
        MyNode<T> node = findNode(index);
        MyNode<T> beforeNode = findNode(index - 1);
        beforeNode.next = node.next;
        size--;
        return node;
    }

    public T get(int index) {
        return findNode(index).item;
    }

    public T set(int index, T e) {
        return findNode(index).item = e;
    }

    public int indexOf(T o) {
        int index = 0;
        MyNode<T> node = first;
        while(node != null) {
            if (node.item.equals(o)) {
                return index;
            }
            node = node.next;
            index++;
        }
        return -1;
    }

    private MyNode<T> findNode(int index) {
        MyNode<T> node = first;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int size() {
        return size;
    }

    public String toString() {
        if (size == 0) return "[]";
        return first.toString();
    }
}
