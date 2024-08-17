package WiSe_18_19_F;

public class Aufgabe2 {

    public static void main(String[] args) {
        int[] result = fiboSum(1,2,5);

        System.out.print("Fibonacci array: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);

            if (i< result.length-1){
                System.out.print(", ");
            }
        }
        System.out.print("]\n");

        verschiebe(result);
    }

    public static int[] fiboSum(int zahl1,int zahl2,int size){
        if(zahl2<zahl1){
            throw new IllegalArgumentException("Falsche Eingabe\n");
        }
        int[] result = new int[size];
        result[0]=zahl1;
        result[1]=zahl2;

        for (int i = 2; i < result.length; i++) {
            result[i]=result[i-2]+result[i-1];
        }
        return result;
    }

    public static void verschiebe (int[] array){

        System.out.print("Array vorher: [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);

            if (i< array.length-1){
                System.out.print(", ");
            }
        }
        System.out.print("]\n");

        int lastElement=array[array.length-1];

        for (int i = array.length-1;i>0; i--) {
            array[i]=array[i-1];
        }
        array[0]=lastElement;

        System.out.print("Array danach: [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);

            if (i< array.length-1){
                System.out.print(", ");
            }
        }
        System.out.print("]\n");
    }
}
