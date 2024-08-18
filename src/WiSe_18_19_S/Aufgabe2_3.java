package WiSe_18_19_S;

public class Aufgabe2_3 {

    public static void main(String[] args) {
        System.out.println("Das Ergebnis der Multiplikation ist: "+productOfNumbers(-3,2));
        System.out.println("Das Ergebnis der Multiplikation ist: "+productOfNumbers(2,6));


        int[] result = fiboSum(2,4,6);
        System.out.print("Das Übungen.Fibonacci-Array ist: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i< result.length-1){
                System.out.print(", ");
            }
        }
        System.out.println("]\n");
    }

    public static int[] fiboSum(int start1,int start2,int size){
        if(start2<start1){
            throw new IllegalArgumentException();
        }
        int[] result = new int[size];
        result[0]=start1;
        result[1]=start2;

        for (int i = 2; i < result.length; i++) {
            result[i]=result[i-1]+result[i-2];
        }
        return result;
    }


    public static int productOfNumbers(int low,int high){
        int result = 1;

        if(high<low){
            return 1;
        }

        for (int i = low; i <= high ; i++) {
            if(i<0){
                result=result*(i*-1);
            }else {
                result = result * i;
            }
        }
        return result;
    }
}
