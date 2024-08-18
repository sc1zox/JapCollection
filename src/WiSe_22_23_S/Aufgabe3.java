package WiSe_22_23_S;

public class Aufgabe3 {

    boolean[] Result; // hier hätte man neue Klasse erstellen sollen mit den Attributen + Konstruktor und dann als RückgabeWert nutzen
    int equalCount;

    public static void main(String[] args) {
        Aufgabe3 neu = new Aufgabe3();

        int[] result = {1,25,4,23,2,-5,-9,0,25,-25};
        neu.isEqual(result,25);

        System.out.print("Boolean Array: [");
        for (int i = 0; i <neu.Result.length ; i++) {
            System.out.print(neu.Result[i]);
            if(i<neu.Result.length-1){
                System.out.print(", ");
            }
        }
        System.out.print("]\n");

        System.out.println("Es gab "+neu.equalCount+" Übereinstimmungen\n");
    }

    public void isEqual(int[] array,int check){
        this.equalCount = 0;
        this.Result = new boolean[array.length];

        for (int i = 0; i < array.length; i++) {
            if(array[i]==check){
                this.Result[i]=true;
                equalCount++;
            }else {
                this.Result[i]=false;
            }
        }
    }
}
