package WiSe_21_22_F;

public class WartezimmerImpl implements Wartezimmer{
    Patient first;
    int wartende;

    public WartezimmerImpl(){
        first=null;
        wartende=0;
    }

    @Override
    public void betreteWartezimmer(Patient patient){
        if(first==null){
            first=patient;
            this.wartende++;
        }else{
            Patient current = first;
            while(current.next!=null){
                current=current.next;
            }
            current.next=patient;
            this.wartende++;
        }
    }
    @Override
    public int wievieleWarten(){
        return this.wartende;
    }
    @Override
    public Patient derNaechsteBitte() throws WartezimmerEmpty{
        Patient temp;
        if(first==null){
            throw new WartezimmerEmpty("WarteZimmer ist leer");
        }else{
            temp = first;
            first=first.next;
            this.wartende--;
        }
        return temp;
    }
}
