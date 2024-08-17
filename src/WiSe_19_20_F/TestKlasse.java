package WiSe_19_20_F;

public class TestKlasse {

    public static void main(String[] args){
        try {
            MyAmericanTime newTime = new MyAmericanTime((short)23, (short)36);
            newTime.printTheTime();
        }catch (MyIllegalTimeException e){
            System.err.println(e.getMessage());
        }
    }
}
