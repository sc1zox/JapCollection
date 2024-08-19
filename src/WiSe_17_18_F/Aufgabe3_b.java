package WiSe_17_18_F;

public class Aufgabe3_b {

    public static void main(String[] args) {
        int[] array = {10,221,13,14,50};
        int limit = 50;
        ReturnType result;
        result = isLess(array,limit);

        System.out.print("Das boolsche Array ist: [");
        for (int i = 0; i < result.result.length; i++) {
            System.out.print(result.result[i]);
            if(i< result.result.length-1){
                System.out.print(", ");
            }
        }
        System.out.print(" ]\n");

        System.out.println("Es gab "+result.LessCount+" kleinere Zahlen als "+limit);
    }
    public static ReturnType isLess(int[] array, int limit){

        ReturnType result = new ReturnType(array.length);

        for (int i = 0; i < array.length; i++) {
            if(array[i]<limit){
                result.result[i]=true;
                result.LessCount++;
            }else{
                result.result[i]=false;
            }
        }
        return result;
    }
}
