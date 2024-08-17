public class ArraysInJava {

    public void myPrintArray(int[] input){
        System.out.print("[");
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i]);
            if(i!= input.length-1){
                System.out.print(",");
            }
        }
        System.out.print("]\n");
    }

    public int[] initializeArray(int elemcount){
        int[] returnArray= new int[elemcount];

        int count = elemcount;
        int i = 0;
        while (count>0){
            returnArray[i++]=count;
            count--;
        }
        return returnArray;
    }

}
