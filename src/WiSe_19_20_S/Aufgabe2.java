package WiSe_19_20_S;

public class Aufgabe2 {
    public static void main(String[] args) {
        System.out.println("Die Summer von -3 und 2 ist: "+sumOfNumbers(-3,2));

    }
    public static int sumOfNumbers(int low,int high){
        int result = 0;
        if(high<low){
            System.out.println("error input");
            return 0;
        }else{
            for (int i = low; i <= high; i++) {
                if(i<0){
                    result+=(i*-1);
                }else {
                    result+=i;
                }
            }
        }
        return result;
    }
}
