package WiSe_17_18_S;

public class Aufgabe2 {
    public static void main(String[] args) {
        System.out.println(diffBetweenThreeNumbers(-1,4,6));
        System.out.println(diffBetweenThreeNumbers(-3,0,-42));

    }
    public static int diffBetweenThreeNumbers(int first,int second,int third){
        int result = 0;
        if(first>second || second > third){
            return 0;
        }
        for (int i = first; i <= second; i++) {
            result+=i;
        }
        for (int i = second; i <= third; i++) {
            result-=i;
        }
        return result;
    }
}
