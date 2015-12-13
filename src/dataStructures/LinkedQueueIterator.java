package dataStructures;


import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedQueueIterator<T> implements Iterator<T> {
    LinkedQueue<T> lq = new LinkedQueue<>();
    private Node<T> current = lq.head;

    @Override
    public boolean hasNext(){
        return current != null;
    }

    @Override
    public T next(){
        if (!hasNext()){
            throw new NoSuchElementException();
        }
        T value = current.value;
        current = current.next;
        return value;
    }




}
