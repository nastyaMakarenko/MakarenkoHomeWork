package dataStructures;


public class LinkedQueue<T> implements Iterable<T>, IQueue<T> {
    public Node<T> head;
    public Node<T> tail;
    private int size;


    @Override
    public LinkedQueueIterator<T> iterator(){
        return new LinkedQueueIterator<T>();
    }


    @Override
    public void enqueue(T obj) {
        if(size() == 0){
            head = new Node<>(obj, null);
            tail = head;
        } else {
            Node<T> nNode = new Node<>(obj, null);
            tail.next = nNode;
            tail = nNode;
        }

        size++;
    }

    @Override
    public T dequeue() {
        if(size() == 0){
            throw new QueueEmptyException();
        }
        T forRet = head.value;
        head = head.next;
        size--;

        return forRet;
    }

    @Override
    public int size() {
        return size;
    }


    @Override
    public T next(){
        LinkedQueueIterator<T> iter = new LinkedQueueIterator<>();
        T res = iter.next();
        return res;
    }

    @Override
    public boolean hasNext(){
        LinkedQueueIterator<T> iter = new LinkedQueueIterator<>();
        boolean res = iter.hasNext();
        return res;
    }


}

