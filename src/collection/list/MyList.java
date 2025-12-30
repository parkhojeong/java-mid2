package collection.list;

import collection.link.MyLinkedListV3;

public interface MyList<E> {

    public void add(E e);

    public void add(int index, E e);

    public E set(int index, E e);
    public E remove(int index);

    public E get(int index);

    public int indexOf(E o);

    public int size();

    public String toString();
}
