package WiSe_20_21_S;

public interface StackPlus {
    void push(int x);
    int top() throws EmptyStackException;
    void pop();
    void invert();
    StackPlus copy() throws EmptyStackException;
    void PrintStack();
}
