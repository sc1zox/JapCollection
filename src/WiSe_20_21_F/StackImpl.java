package WiSe_20_21_F;

public class StackImpl implements Stack{

    private ElemImpl top;

    public StackImpl(){
        top=null;
    }

    @Override
    public void push(String s) {

        ElemImpl insert = new ElemImpl(s);
        if (top==null){
            top=insert;
        }else{
            insert.next=top;
            top=insert;
        }
    }

    @Override
    public String top() {
        try {
            if(top==null){
                throw new EmptyStack();
            }
        }catch (EmptyStack e){
            System.err.println("Stack is empty" + e.getMessage());
            return("");
        }

    return top.content;
    }

    @Override
    public void pop() {
        top=top.next;
    }
}
