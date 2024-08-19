package WiSe_20_21_S;

public class StackImpl implements StackPlus{

    private Elem first;
    private int size;

    public StackImpl(){
        first=null;
    }

    @Override
    public void push(int x){
        this.first = new ElemImpl(x,this.first);
        size++;
    }
    @Override
    public int top() throws EmptyStackException{
        if(first==null){
            throw new EmptyStackException("Error");
        }
        return first.getContent();
    }

    @Override
    public void pop(){
        this.first=first.getNext();
        size--;
    }
    @Override
    public void invert(){
        if(first==null){
            return;
        }else{
            int[] tmp = new int[size];
            int i=0;
            Elem current = first;
            while(current!=null){
                tmp[i++]=current.getContent();
                current=current.getNext();
            }
            first=null;
            size=0;
            for (int j = 0; j < tmp.length; j++) {
                push(tmp[j]);
            }

        }
    }
    @Override
    public StackPlus copy() throws EmptyStackException{
        StackPlus neu = new StackImpl();
        if(first==null){
            throw new EmptyStackException("Error");
        }else{
            Elem current = first;
            while(current!=null){
                neu.push(current.getContent());
                current=current.getNext();
            }
        }
        return neu;
    }
    public void PrintStack(){
        Elem current = first;
        System.out.print("Stack Inhalt: ");
        while(current!=null){
            System.out.print(current.getContent());
            System.out.print(", ");
            current=current.getNext();
        }
        System.out.println("\n-----------------------------");
    }
}
