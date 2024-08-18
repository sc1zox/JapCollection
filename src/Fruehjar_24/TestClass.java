package Fruehjar_24;

public class TestClass {
    public static void main(String[] args) {
        BitSetFullAccess secondInterface = new BitSetImpl();

        secondInterface.set(5);
        secondInterface.set(4);
        secondInterface.set(3);

        secondInterface.flip(8);
        System.out.println(secondInterface.get(5));
        secondInterface.clear(5);
        System.out.println(secondInterface.get(5));
        System.out.println(secondInterface.getSize());
        secondInterface.expand(10);
        System.out.println(secondInterface.getSize());
        System.out.println(secondInterface.get(19));

        secondInterface.printArray();
    }
}
