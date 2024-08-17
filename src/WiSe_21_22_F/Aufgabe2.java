package WiSe_21_22_F;

public class Aufgabe2 {

    public static void main(String[] args) {
        System.out.println(productOfNumbers(2,6));
    }

    public static int productOfNumbers(int zahl1,int zahl2){
        int result = 1;
        if(zahl2<zahl1){
            return 1;
        }
        for (int i = zahl1; i <= zahl2; i++) {
            if(i>0) {
                result = result * i;
            }else{
                result = result * (i*-1);
            }
        }
        return result;
    }
}
