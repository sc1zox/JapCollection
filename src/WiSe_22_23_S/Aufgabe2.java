package WiSe_22_23_S;

public class Aufgabe2 {
    public static void main(String[] args) {
        System.out.println(sumOfNumbers(-3,2));
    }

    public static int sumOfNumbers(int low,int high){
        int result = 0;
        if(high<low){
            System.out.println("Error Input");
            return 0;
        }else{
            for (int i = low; i <= high; i++) {
                if (i < 0) {
                    result += (i *-1);
                } else {
                    result += i;
                }
            }
        }
        return result;
    }
}
