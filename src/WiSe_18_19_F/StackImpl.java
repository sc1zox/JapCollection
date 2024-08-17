package WiSe_18_19_F;

public class StackImpl implements Stack {
    private int[] array;
    private int top;

    public StackImpl(){
        this.array=new int[10];
        this.top=-1;
    }

    private void resize(){
        int[] newArray = new int[array.length*2];

        for (int i = 0; i < array.length; i++) {
            newArray[i]=array[i];
        }
        array=newArray;
    }

    @Override
    public void push(int input){
        if(top==array.length-1){
            resize();
        }else{
            array[++top]=input;
        }
    }

    @Override
    public int top() throws EmptyStack{
        if(top==-1){
            throw new EmptyStack("Empty stack");
        }
        return array[top];
    }

    @Override
    public int sum(){

        int result=0;

        for (int i = 0; i < this.array.length; i++) {
            result+=array[i];
        }
        return result;
    }


}
