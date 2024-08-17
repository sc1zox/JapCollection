package WiSe_19_20_F;

public class Aufgabe3 {

    public static void main(String[] args) {
        int[] array = {1,-5,2,-67,76,8,9,6,5,4,-3,-2,-56,-7};
        Aufgabe3 BetragsArray = new Aufgabe3();
        BetragsArray.bildeBetrag(array);

        System.out.print("Das BetragsArray ist: [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i< array.length-1){
                System.out.print(", ");
            }
        }
        System.out.print("]\n");

    }

    public void bildeBetrag(int[] werte){
        for (int i = 0; i < werte.length; i++) {
            if(werte[i]<0){
                werte[i]=werte[i]*-1;
            }
        }

    }
}
