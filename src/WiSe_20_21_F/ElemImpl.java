package WiSe_20_21_F;

public class ElemImpl implements Elem{

    public String content;
    public ElemImpl next;

    public ElemImpl(String input){
        this.content=input;
    }

    @Override
    public void printElem(){
        System.out.println(this.content);
    }
}

