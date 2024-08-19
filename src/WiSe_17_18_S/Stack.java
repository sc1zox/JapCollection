package WiSe_17_18_S;

public interface Stack {
    void push(Elem e);
    Elem top() throws EmptyStackException;
    void pop();
}
