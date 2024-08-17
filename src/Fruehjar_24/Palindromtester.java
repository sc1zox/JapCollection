package Fruehjar_24;

public class Palindromtester {

    public static void main(String[] args) {
        Palindromtester neu = new Palindromtester();
        boolean result = neu.isPalindrome(10022001);

        System.out.println("Die Zahl ist ein Palindrom: " + result);
    }
    boolean isPalindrome(int wert){
        int stellen = 0;
        int wertCopy = wert;

        while(wertCopy>0){
            stellen++;
            wertCopy/=10;
        }
        if(stellen%2!=0){
            return false;
        }
        int[] array = new int[stellen];

        for (int i = 0; i < stellen; i++) {
            array[i]=wert%10;
            wert/=10;
        }
        for (int i = 0; i < array.length/2; i++) {
            if(array[i]!=array[array.length-1-i]){
                return false;
            }
        }
        return true;
    }
}
