package WiSe_20_21_S;

public class TestKlasse {
    public static void main(String[] args) {
        StackPlus neuStack= new StackImpl();

        neuStack.push(420);
        neuStack.push(69);
        neuStack.push(1337);
        neuStack.push(110);
        StackPlus copyStack=null;

        neuStack.PrintStack();

        try {
            System.out.println(neuStack.top());
        } catch (EmptyStackException e) {
            System.out.println(e.getMessage());
        }

        try {
            copyStack = neuStack.copy();
            System.out.println(copyStack.top());
            System.out.println(copyStack==neuStack); // Test auf Identität
        } catch (EmptyStackException e) {
            System.out.println(e.getMessage());
        }

        neuStack.invert();
        neuStack.PrintStack();

        try {
            System.out.println(neuStack.top());
        } catch (EmptyStackException e) {
            System.out.println(e.getMessage());
        }
    }
}
