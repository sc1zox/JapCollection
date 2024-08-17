package WiSe_18_19_F;

public interface Stack {

    void push(int input);
    int top() throws EmptyStack;
    int sum();
}
