package WiSe_21_22_S;

public class BitSetImpl implements BitSetReadOnly,BitSetFullAccess{
    boolean[] BitSet = new boolean[45];

    public BitSetImpl(){
        for (int i = 0; i < BitSet.length; i++) {
            BitSet[i]=false;
        }
    }

    @Override
    public boolean get(int index) {
        if(index<0 || index>BitSet.length){
            System.err.println("Index out of bounds");
            return false;
        }
        return this.BitSet[index];
    }

    @Override
    public int getUsedSize() {
        return BitSet.length;
    }

    @Override
    public boolean[] expand(int n) {
        boolean[] newResult = new boolean[this.BitSet.length+n];

        if(n<0){
            throw new IllegalArgumentException("Index < 0");
        }

        for (int i = 0; i < BitSet.length; i++) {
            newResult[i]=BitSet[i];
        }
        for (int i = BitSet.length; i < newResult.length; i++) {
            newResult[i]=false;
        }
        this.BitSet=newResult;

        return BitSet;
    }

    @Override
    public void set(int index) {
        if(index<0){
            throw new IllegalArgumentException("Index < 0");
        }
        this.BitSet[index]=true;
    }

    @Override
    public void clear(int index) {
        if(index<0){
            throw new IllegalArgumentException("Index < 0");
        }
        this.BitSet[index]=false;
    }

    @Override
    public void flip(int index) {
        if(index<0){
            throw new IllegalArgumentException("Index < 0");
        }
        this.BitSet[index]= !this.BitSet[index];
    }
}
