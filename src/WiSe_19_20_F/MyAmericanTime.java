package WiSe_19_20_F;

public class MyAmericanTime extends MyTime{

    public MyAmericanTime(short Stunden,short Minuten) throws MyIllegalTimeException{
        super(Stunden,Minuten);
    }

    public void printTheTime(){
        if(super.Stunden>12){
            System.out.println(super.Stunden-12 + "hours " + super.Minuten + "PM");
        }else{
            System.out.println(super.Stunden + "hours " + super.Minuten + "AM");
        }
    }
}
