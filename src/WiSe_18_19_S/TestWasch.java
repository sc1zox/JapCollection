package WiSe_18_19_S;

public class TestWasch {
    public static void main(String[] args) {
        Auftragsspeicher neueWasch = new Auftragsspeicher();
        neueWasch.neuerAuftrag((byte)1);
        neueWasch.neuerAuftrag((byte)2);
        neueWasch.neuerAuftrag((byte) 5);

        System.out.println(neueWasch.aktuellerAuftrag.programmNr);
        System.out.println(neueWasch.aktuellerAuftrag.naechsterAuftrag.programmNr);
        System.out.println(neueWasch.aktuellerAuftrag.istAktiv);


        neueWasch.beendetNaechsterAuftrag();

        System.out.println(neueWasch.aktuellerAuftrag.programmNr);
        System.out.println(neueWasch.aktuellerAuftrag.naechsterAuftrag.programmNr);
        System.out.println(neueWasch.aktuellerAuftrag.istAktiv);


    }
}
