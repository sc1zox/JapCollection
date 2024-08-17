package WiSe_20_21_S;

public class ArrayHandling {

    public static void main(String[] args) {
        int[] array = {1,-22,24,3,-5,6,-9};
        System.out.println("Anzahl der neg Elemente des Arrays: "+countNeg(array));
        extract(array);

        DoubleArray result = split(array);

        System.out.print("Positive SplitArray: [");
        for (int i = 0; i < result.positive.length; i++) {
            System.out.print(result.positive[i]);
            if(i<result.negative.length-1){
                System.out.print(", ");
            }
        }
        System.out.print("]\n");

        System.out.print("Negative Split Array [");
        for (int i = 0; i < result.negative.length; i++) {
            System.out.print(result.negative[i]);
            if(i<result.negative.length-1){
                System.out.print(", ");
            }
        }
        System.out.print("]\n");
    }

    public static int countNeg(int[] array){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]<0){
                count++;
            }
        }
        return count;
    }
    public static void extract(int[] array){
        int maxNeg=countNeg(array);
        int[] neg = new int[maxNeg];
        int iterator=0;

        for (int i = 0; i < array.length; i++) {
            if(array[i]<0){
                neg[iterator++]=array[i];
            }
        }
        if(maxNeg==0){
            System.err.println("Keine neg Elemente\n");
        }
        System.out.print("Extracted Elements: [");
        for (int i = 0; i < neg.length; i++) {
            System.out.print(neg[i]);
            if(i<neg.length-1){
                System.out.print(", ");
            }
        }
        System.out.print("]\n");
    }
    public static DoubleArray split(int[] array){
        int maxNeg = countNeg(array);
        int maxPos = array.length-maxNeg;

        DoubleArray result = new DoubleArray();

        result.negative = new int[maxNeg];
        result.positive = new int[maxPos];
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i]<0){
                result.negative[count1++]=array[i];
            }else{
                result.positive[count2++]=array[i];
            }
        }
        return result;
    }
}
