package WiSe_22_23_F;

public interface MyList {

    void insertElem(int content);
    int readAndDelElem() throws EmptyListException;
    int maxOfElems();
    void printList();
}
