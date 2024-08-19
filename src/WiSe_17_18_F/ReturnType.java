package WiSe_17_18_F;

public class ReturnType{
    boolean[] result;
    int LessCount;

    public ReturnType(int size){
        if(size<1){
            return;
        }
        result = new boolean[size];
        for (int i = 0; i < result.length; i++) {
            result[i]=false;
        }
        LessCount=0;
    }
}