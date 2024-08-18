package Übungen;

class StaticIsForBeginners{

    public static int sum0fNumbers(int max) throws NullPointerException{
        int result=0;

        try {

            if(max>=0) {
                for (int i = 0; i <= max; i++) { //max inbegriffen oder nicht?
                result += i;
                }
            }else {
                throw new NullPointerException();
            }
        }catch (NullPointerException e){
            System.err.println("Error in sum0fNumbers - Negative Input: "+ max +" "+e);
        }
        return result;
    }

    public static int sum0fOddNumbers(int max){
        int result = 0;
        try {
            if(max>=0){

                for (int i = 0; i <= max; i++) { //max inbegriffen oder nicht?
                    if(i%2!=0){
                        result+=i;
                    }
                }

            }else {
                throw new NullPointerException();
            }
        }catch (NullPointerException e){
            System.err.println("Error in sum0fNumbers - Negative Input: "+e);
        }
        return result;
    }


    public static void main(String[] args) {


        int[] felde = new int[6];
        int[] feldo = new int[6];
        int[] feldresult = new int[felde.length+ feldo.length];

        int counter2=5;
        int counter = 0;
        int i=0;
        int x = 1;

        while(counter<=5){
            if(i%2==0) {
                felde[counter] = i;
                counter++;
            }
            i++;
        }
        while(counter2>=0){
            if(x%2==1){
                feldo[counter2]=x;
                counter2--;
            }
            x++;
        }

        int w = 0;

        for (int j = 0; j < feldresult.length/2; j++) {
            feldresult[w++]=felde[j];
            feldresult[w++]=feldo[j];
        }

        // outputs
        for (int l = -2; l < 20; l++) {
            System.out.println("Das Ergebnis von Numbers ist:"+ " " + sum0fNumbers(l) + "\n" + "Die Eingabe war "+l+ "\n ------------ \n");
            System.out.println("Das Ergebnis von OddNumbers ist:"+ " " + sum0fOddNumbers(l) + "\n" + "Die Eingabe war "+l + "\n ------------ \n");
        }
        for (int j = 0; j < feldresult.length; j++) {
            System.out.println(feldresult[j]);
        }
    }
}