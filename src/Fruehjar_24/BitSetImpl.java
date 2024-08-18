package Fruehjar_24;

public class BitSetImpl implements BitSetReadOnly,BitSetFullAccess{

    boolean[] Bits;

    public BitSetImpl(){
        this.Bits= new boolean[10];
        for (int i = 0; i < Bits.length; i++) {
            Bits[i]=false;
        }
    }

    @Override
    public boolean get(int index){
        return Bits[index];
    }

    @Override
    public int getSize(){
        return this.Bits.length;
    }

    @Override
    public void expand(int n){
        if(n<1){
            System.out.println("Error input\n");
        }else{
            boolean[] neu = new boolean[this.Bits.length+n];

            for (int i = 0; i < Bits.length; i++) {
                neu[i]=Bits[i];
            }
            for (int i = Bits.length; i < neu.length; i++) {
                neu[i]=false;
            }
            this.Bits=neu;
        }
    }

    @Override
    public void set(int index){
        this.Bits[index]=true;
    }

    @Override
    public void clear(int index){
        this.Bits[index]=false;
    }

    @Override
    public void flip(int index){
        if(this.Bits[index]){
            this.Bits[index]=false;
        }else{
            this.Bits[index]=true;
        }
    }

    @Override
    public void printArray(){
        System.out.print("Boolean Array: [");
        for (int i = 0; i <this.Bits.length ; i++) {
            System.out.print(Bits[i]);
            if(i<Bits.length-1){
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}
