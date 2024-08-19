package WiSe_17_18_F;

public class Queue {
    private Elem first;
    private Elem last;

    public Queue(){
        first=null;
        last=null;
    }
    public void readFirst() throws EmptyQueueException{
        if(first==null){
            throw new EmptyQueueException("Error input");
        }else{
            System.out.println("Das erste Element ist: " + first.content);
        }
    }

    public void enqueue(int content){
        Elem einfuegen = new Elem(content);
        if(first==null){
            first=einfuegen;
            last=einfuegen;
        }else{
            last.next=einfuegen;
            last=einfuegen;
        }
    }
    public void dequeue() throws EmptyQueueException{

        if(first==null){
            throw new EmptyQueueException("Leere Queue - cannot dequeue");
        }else {
            if(first.next!=null) {
                first = first.next;
            }else {
                first=null;
                last=null;
            }
        }
    }

    public void printQueue() throws EmptyQueueException{
        if(first==null){
            throw new EmptyQueueException("Leere Queue - cannot print\n");
        }else{
            Elem current= first;
            while(current!=null){
                System.out.println("Der Inhalt des Elem ist: "+current.content);
                current=current.next;
            }
            System.out.println("---------------------------");
        }
    }

}
