package WiSe_20_21_F;


public interface Stack {
    public void push(String s);
    public String top () throws EmptyStack;
    public void pop();
}
