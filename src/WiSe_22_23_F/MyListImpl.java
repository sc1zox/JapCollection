package WiSe_22_23_F;

public class MyListImpl implements MyList {

    Elem front;
    Elem back;

    @Override
    public void insertElem(int content) {
        Elem neu = new Elem(content);
        if (front == null) {
            front = neu;
            back = neu;
        } else {
            back.next = neu;
            back = neu;
        }
    }

        @Override
        public int readAndDelElem () throws EmptyListException{
        int result = 0;
            if(front==null){
                throw new EmptyListException("List Leer\n");
            }else{
                result = front.content;
                if(front.next==null){
                    front=null;
                    back=null;
                }else {
                    front = front.next;
                }
            }
            return result;
        }

        @Override
        public int maxOfElems () {
        int max = 0;

            if(front==null){
                return -42;
            }else{
                Elem current = front;
                while(current.next!=null){
                    if(current.content>max){
                        max=current.content;
                    }
                    current=current.next;
                }
            }
            return max;
        }

        @Override
    public void printList(){
        Elem current = front;
            System.out.println("Front ist: " + front.content);
            System.out.println("Back ist: "+ back.content);
        while(!(current.next==null)){
            System.out.println("Das Element ist: " + current.content);
            current=current.next;
        }
            System.out.println("Das Element ist: " +current.content);
        }
    }
