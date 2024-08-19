package WiSe_20_21_S;

public class ElemImpl implements Elem{
    public int content;
    public Elem next;

    public ElemImpl(int content,Elem next){
        this.content=content;
        this.next=next;
    }

    @Override
    public int getContent(){
        return this.content;
    }
    @Override
    public Elem getNext(){
        return this.next;
    }
    @Override
    public void printElem(){
        System.out.println(this.content);
    }
}
