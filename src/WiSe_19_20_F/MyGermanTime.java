package WiSe_19_20_F;

public class MyGermanTime extends MyTime{

    public MyGermanTime(short Stunden, short Minuten) throws MyIllegalTimeException {
        super(Stunden, Minuten);
    }

    public void printTheTime(){
        System.out.println(super.Stunden + "Uhr " + super.Minuten +"Minuten\n");
    }
}
