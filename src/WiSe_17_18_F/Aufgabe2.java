package WiSe_17_18_F;

public class Aufgabe2 {
    public static void main(String[] args) {
        int result = sumOfNumbers(-3,2);
        System.out.println("Die Summer von -3 bis 2 ist: " + result);
        System.out.println("Die Summe von -1 und -4 ist: " + sumOfNumbers(-1,-4)); //High<Low
    }
    public static int sumOfNumbers(int low,int high){

        if(high<low){
            return 0;
        }

        int result = 0;

        for (int i = low; i <= high; i++) {
            if(i<0){
                result+=(i*-1);
            }else {
            result+=i;
            }
        }
        return result;
    }
}
