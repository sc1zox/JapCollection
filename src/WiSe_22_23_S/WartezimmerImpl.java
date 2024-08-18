package WiSe_22_23_S;

public class WartezimmerImpl implements Wartezimmer{

    private Patient first;

    @Override
    public void betreteWartezimmer(Patient patient) {
        if(first==null){
            first=patient;
        }else{
            Patient current = first;
            while(current.next!=null){
                current=current.next;
            }
            current.next=patient;
        }
    }

    @Override
    public int wievieleWarten(){
        int count = 0;

        if(first!=null){
            Patient current = first;
            while(current!=null){
                count++;
                current=current.next;
            }
        }else{
            System.out.println("Liste leer");
        }
        return count;
    }

    @Override
    public Patient derNaechsteBitte() throws NiemandDaException{
        Patient patient;
        if(first==null){
            throw new NiemandDaException("Error");
        }else{
            patient=first;
            first=first.next;
        }
        return patient;
    }
}
