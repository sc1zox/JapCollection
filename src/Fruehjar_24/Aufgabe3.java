package Fruehjar_24;

public class Aufgabe3 {
    public static void main(String[] args) {
        int[] array = {2,4};
        int[] result = komplettiere(array,40);

        System.out.print("Komplettiere: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if(i< result.length-1){
                System.out.print(", ");
            }
        }
        System.out.print("]\n");
    }

    static int[] komplettiere(int[] in, int max) {
        int[] counter = new int[50];
        counter[0] = in[0];
        counter[1] = in[1];
        int i = 2;
        int countercount = 2;

        while (true) {
            // Zuerst den neuen Wert berechnen
            counter[i] = counter[i-1] + counter[i-2];

            // Jetzt prüfen, ob der Wert das Limit überschreitet
            if (counter[i] > max) {
                break;  // Schleife beenden, wenn der Wert größer als max ist
            }
            countercount++;
            i++;
        }

        int[] ergebnis = new int[countercount];
        for (int j = 0; j < countercount; j++) {
            ergebnis[j]=counter[j];
        }
    return ergebnis;
    }
}
