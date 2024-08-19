package WiSe_17_18_S;

public class StackImpl implements Stack{
    private ElemImpl top;

    public StackImpl(){
        this.top=null;
    }

    @Override
    public void push (Elem e){
        ElemImpl neu = (ElemImpl) e;

        if(top==null){
            this.top = neu;
        }else{
            neu.next=top;
            this.top=neu;
        }
    }
    @Override
    public Elem top() throws EmptyStackException{
        if(this.top == null){
            throw new EmptyStackException("Error input");
        }else{
            return this.top;
        }
    }

    @Override
    public void pop(){
        if(top==null){
            return;
        }else{
            this.top=top.next;
        }
    }
}
