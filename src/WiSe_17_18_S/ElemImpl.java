package WiSe_17_18_S;

public class ElemImpl implements Elem{

    String content;
    ElemImpl next;

    public ElemImpl(String content){
        this.content=content;
        this.next=null;
    }

    @Override
    public void printElem(){
        System.out.println(this.content);
    }
}
