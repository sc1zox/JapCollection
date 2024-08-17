package WiSe_20_21_F;

public class Aufgabe2 {

    public static void main(String[] args) throws EmptyStack {
        int[] feld1={1,2};
        komplettiere(feld1,21);
    }

    public static void komplettiere(int[] feld1,int max){
        int num2 = feld1[1];
        int res = feld1[0]+feld1[1];
        int counter = 1;

        while(res<max){
            int temp = res;
            res+=num2;
            num2=temp;

            counter++;
        }
        int[] ergebnis = new int[feld1.length+counter];
        ergebnis[0]=feld1[0];
        ergebnis[1]=feld1[1];
        ergebnis[2]=feld1[0]+feld1[1];
        int counter2=3;

        int num3 = feld1[1];
        int res2 = feld1[0]+feld1[1];

        while(res2<max){
            int temp = res2;
            res2+= num3;
            num3 =temp;

            ergebnis[counter2++]=res2;
        }

        for (int i = 0; i < ergebnis.length; i++) {
            System.out.println(ergebnis[i]+ ", ");
        }
    }
}
