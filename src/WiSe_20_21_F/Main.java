package WiSe_20_21_F;

public class Main {
    public static void main(String[] args) throws EmptyStack {
        Stack myStack = new StackImpl();
        myStack.push("hallo");
        myStack.push("xd");
        myStack.push("Alex Stinkt");
        myStack.push("Lass einen bauen");
        myStack.push("420 Blaze it");
        System.out.println(myStack.top());
        myStack.pop();
        System.out.println(myStack.top());
    }
}








































