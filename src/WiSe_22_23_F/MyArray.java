package WiSe_22_23_F;

public class MyArray {

    public static void main(String[] args) {
        int[] Array = {1,2,-3,-4,5,-6,-7};
        System.out.println(countEven(Array));
        getEvenNumbers(Array);
        int[] result = fiboSum(2,4,6);

        System.out.print("FiboSum Array: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]\n");
    }

    public static int countEven(int[] array){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2==0){
                count++;
            }
        }
        return count;
    }

    public static void getEvenNumbers(int[] array){
        int count = countEven(array);
        int[] result = new int[count];
        int counterResult = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i]%2==0){
                result[counterResult++]=array[i];
            }
        }
        if(result.length>0) {
            System.out.print("Even Array: [");
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i]);
                if (i < result.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.print("]\n");
        }else{
            System.out.println("Array ist leer \n");
        }
    }

    public static int[] fiboSum(int zahl1,int zahl2,int size) {
        if (zahl2 < zahl1 || size<2) {
            System.out.println("Error input\n");
        }
        int[] result = new int[size];
        result[0]=zahl1;
        result[1]=zahl2;

        for (int i = 2; i < result.length; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }
    return result;
    }
}
