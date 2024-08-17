package WiSe_21_22_S;

public class Main {

    public static void main(String[] args) {
        System.out.println(diffBetweenThreeNumbers(-1,4,6));

        int[] feld1 = {2,5,4,6,22,3,2,34,5,334};
        boolean[] array = isLess(feld1,42);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static boolean[] isLess(int[] array,int check) {
        boolean[] result = new boolean[array.length];
        int count = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] < check) {
                result[i] = true;
                count++;
            } else {
                result[i] = false;
            }
        }
        System.out.println("Das Ergebnisarray hat " + count +" kleinere Werte");
        return result;
    }

    public static int diffBetweenThreeNumbers(int first,int second,int third){
        if(!(first<=second) || !(second<=third)){
            return 0;
        }
        int result = 0;

        for (int i = first; i <= second ; i++) {
            result+=i;
        }
        for (int i = second; i <= third ; i++) {
            result-=i;
        }
        return result;
    }
}
