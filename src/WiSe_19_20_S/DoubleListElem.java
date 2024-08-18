package WiSe_19_20_S;

public class DoubleListElem {
    public int content;
    public DoubleListElem previous, next;

    public DoubleListElem(int e) {
        this.content=e;
        this.next=null;
        this.previous=null;
    }

}
