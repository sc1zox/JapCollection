package WiSe_17_18_S;

public class Aufgabe3 {
    public static void main(String[] args) {
        int[] array = {1,5,4,3,22,11,22,-22,24,0};

        ReturnType res = isEqual(array,22);

        System.out.println("Es gab "+res.equalCount+" Übereinstimmungen");

        System.out.print("Boolean Array: [");
        for (int i = 0; i <res.result.length ; i++) {
            System.out.print(res.result[i]);
            if(i<res.result.length-1){
                System.out.print(", ");
            }
        }
        System.out.print("]\n");

    }
    public static ReturnType isEqual(int[] array,int check){
        ReturnType neu = new ReturnType(array.length);

        for (int i = 0; i < array.length; i++) {
            if(array[i]==check){
                neu.result[i]=true;
                neu.equalCount++;
            }else{
                neu.result[i]=false;
            }
        }
        return neu;
    }
}
