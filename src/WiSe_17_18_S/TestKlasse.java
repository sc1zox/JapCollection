package WiSe_17_18_S;

public class TestKlasse {
    public static void main(String[] args) {
        Stack neuStack = new StackImpl();
        Elem neuesElem = new ElemImpl("xd");
        Elem neuesElem2  = new ElemImpl("420");

        neuStack.push(neuesElem);
        neuStack.push(neuesElem2);

        try{
            Elem topElem = neuStack.top();
            topElem.printElem();
        }catch (EmptyStackException e){
            System.out.println(e.getMessage());
        }

        neuStack.pop();

        try {
            Elem topElem = neuStack.top();
            topElem.printElem();
        }catch (EmptyStackException e){
            System.out.println(e.getMessage());
        }

    }
}
