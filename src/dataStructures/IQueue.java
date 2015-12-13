package dataStructures;


import java.util.Iterator;

public interface IQueue<T> extends Iterator {
    void enqueue(T node);
    T dequeue();
    int size();
    Iterator<T> iterator();
}

