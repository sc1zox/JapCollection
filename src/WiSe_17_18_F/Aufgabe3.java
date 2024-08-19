package WiSe_17_18_F;

public class Aufgabe3 {
    public static void main(String[] args) {
        int[] array = {10,221,13,14,50};
        int limit = 50;
        boolean[] result = isLess(array,limit);

        System.out.print("Das boolsche Array ist: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if(i< result.length-1){
                System.out.print(", ");
            }
        }
        System.out.print(" ]");
    }
    public static boolean[] isLess(int[] array,int limit){
        int lessCount = 0;
        boolean[] result = new boolean[array.length];

        for (int i = 0; i < array.length; i++) {
            if(array[i]<limit){
                result[i]=true;
                lessCount++;
            }else{
                result[i]=false;
            }
        }
        System.out.println("Es gab "+lessCount+" kleinere Zahlen als "+limit);
        return result;
    }
}
