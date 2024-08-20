package WiSe_19_20_F;

public class Warteschlange {
    // Anzahl der Personen die bisher gewartet haben
    private int bisherGewartet = 0;
    // Referenz auf die erste wartende Person
    private Person beginnDerSchlange;
    // Referenz auf die letzte wartende Person
    private Person endeDerSchlange;

    public void hintenAnstellen(){
        Person neu = new Person(bisherGewartet++);

        if(beginnDerSchlange==null){
            beginnDerSchlange=neu;
            endeDerSchlange=neu;
        }else{
            endeDerSchlange.next=neu;
            endeDerSchlange=neu;
        }
    }
    public int ermittleZahlWartender(){
        int count = 0;
        if(beginnDerSchlange==null){
            System.out.println("Schlange leer");
         return 0;
        }

        Person current = beginnDerSchlange;

        while(current!=null){
            count++;
            current=current.next;
        }
        return count;
    }

    public void neueFahrt(int maxAnzahl){
        int Wartende = ermittleZahlWartender();

        if(Wartende>maxAnzahl){
            Person current = beginnDerSchlange;
            while(current.next!=null && maxAnzahl>0){
                current=current.next;
                maxAnzahl--;
            }
            beginnDerSchlange=current;
        }else{
            beginnDerSchlange=null;
            endeDerSchlange=null;
        }
    }
}
