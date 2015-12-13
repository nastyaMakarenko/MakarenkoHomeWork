package dataStructures;

public class TestLinkedQueueIterator {
    public static void main(String[] args) {

        LinkedQueue<String> linkedQueue = new LinkedQueue<>();
        linkedQueue.enqueue("Andrey");
        linkedQueue.enqueue("Ivan");
        linkedQueue.enqueue("Serhii");
        linkedQueue.enqueue("Oleg");
        linkedQueue.enqueue("Bogdan");
        linkedQueue.enqueue("Nastia");
        linkedQueue.enqueue("Tania");
        linkedQueue.enqueue("Bogdan");
        linkedQueue.enqueue("Jenia ");

        LinkedQueueIterator<String> linkedQueueIterator = linkedQueue.iterator();

        while(linkedQueueIterator.hasNext()){
            System.out.println(linkedQueueIterator.next());
        }

        for(String value : linkedQueue){
            System.out.println(value);
        }


    }
}
