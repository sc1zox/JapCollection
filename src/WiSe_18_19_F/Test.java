package WiSe_18_19_F;

public class Test {
    public static void main(String[] args) {
        Stack myStack = new StackImpl();

        try {
            System.out.println(myStack.top());
        }catch(EmptyStack e){
            System.err.println(e.getMessage());
        }

        myStack.push(11);
        myStack.push(-2);
        myStack.push(22);
        myStack.push(5);
        myStack.push(-1);

        try{
            System.out.println("Das oberste Element: "+myStack.top());
        }catch (EmptyStack e){
            System.err.println(e.getMessage());
        }
        System.out.println("Die Summe der Elemente: "+myStack.sum());

    }
}
