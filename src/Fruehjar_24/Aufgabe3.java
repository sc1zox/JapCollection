package Fruehjar_24;

public class Aufgabe3 {
    public static void main(String[] args) {
        int[] array = {2,4};
        int[] result = komplettiere(array,40);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    static int[] komplettiere(int[] in, int max) {
        int[] counter = new int[50];
        counter[0] = in[0];
        counter[1] = in[1];
        int i = 3;
        int countercount = 0;

        while(counter[i]<=max){
            counter[i]+=counter[(i-1)];
            i++;
            countercount++;
        }
        int[] ergebnis = new int[countercount];
        for (int j = 0; j < countercount; j++) {
            ergebnis[j]=counter[j];
        }
    return ergebnis;
    }
}
