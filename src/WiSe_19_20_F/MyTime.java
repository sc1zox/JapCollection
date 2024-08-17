package WiSe_19_20_F;

public class MyTime {
    short Stunden;
    short Minuten;

    public MyTime(short Stunden,short Minuten) throws MyIllegalTimeException{
        if(Stunden<0 || Stunden>23 || Minuten<0 || Minuten > 59){
            throw new MyIllegalTimeException("Falsche Eingabe\n");
        }
        this.Stunden=Stunden;
        this.Minuten=Minuten;
    }

    public boolean amIEarlier(MyTime Uhrzeit1){
        if(this.Stunden< Uhrzeit1.Stunden){
            return true;
        }
        else if (this.Stunden == Uhrzeit1.Stunden && this.Minuten< Uhrzeit1.Minuten) {
            return true;
        }
    return false;
    }
}
