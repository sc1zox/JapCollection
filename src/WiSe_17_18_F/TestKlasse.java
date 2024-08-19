package WiSe_17_18_F;

public class TestKlasse {
    public static void main(String[] args) {
        Queue neu = new Queue();


        neu.enqueue(420);
        neu.enqueue(69);
        neu.enqueue(42);
        neu.enqueue(1337);
        neu.enqueue(97);
        neu.enqueue(110);
        neu.enqueue(1);
        neu.enqueue(20);
        neu.enqueue(30);

        try{
            neu.readFirst();
        } catch (EmptyQueueException e) {
            System.out.println(e.getMessage());
        }
        try {
            neu.printQueue();
            neu.dequeue();
            neu.printQueue();
            neu.dequeue();
            neu.dequeue();
            neu.dequeue();
            neu.printQueue();
            neu.dequeue();
            neu.dequeue();
            neu.dequeue();
            neu.dequeue();
            neu.printQueue();
            neu.dequeue();
            neu.enqueue(420);
            neu.printQueue();
        } catch (EmptyQueueException e) {
            System.out.println(e.getMessage());
        }
    }
}
