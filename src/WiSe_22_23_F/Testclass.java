package WiSe_22_23_F;

public class Testclass {

    public static void main(String[] args) {

        MyList Liste = new MyListImpl();
        Liste.insertElem(5);
        Liste.insertElem(10);
        Liste.insertElem(1);
        Liste.insertElem(3);
        Liste.insertElem(25);
        Liste.insertElem(2);
        Liste.insertElem(500);

        Liste.printList();

        try {
            System.out.println("Das gelöschte Element: "+Liste.readAndDelElem());
        }catch (EmptyListException e){
            System.out.println("Error "+e.getMessage());
        }
        Liste.printList();
        System.out.println(Liste.maxOfElems());
    }
}
