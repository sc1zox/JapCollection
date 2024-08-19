package WiSe_21_22_F;

public class TestKlasse {
    public static void main(String[] args) {
        Wartezimmer neu = new WartezimmerImpl();

        Patient patient1 = new Patient("Alex");
        Patient patient2 = new Patient("Babitzka");
        Patient patient3 = new Patient("StinkyDiana");

        neu.betreteWartezimmer(patient1);
        neu.betreteWartezimmer(patient2);
        neu.betreteWartezimmer(patient3);

        System.out.println(neu.wievieleWarten());

        try{
            neu.derNaechsteBitte();
        }catch (WartezimmerEmpty e){
            System.out.println(e.getMessage());
        }

        System.out.println(neu.wievieleWarten());
    }
}
