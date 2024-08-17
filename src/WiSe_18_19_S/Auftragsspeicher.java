package WiSe_18_19_S;

public class Auftragsspeicher {
    public Waschauftrag aktuellerAuftrag = null;


    public void neuerAuftrag(byte programmNr) {

        Waschauftrag neu = new Waschauftrag(programmNr);

        if (aktuellerAuftrag == null) {
            neu.istAktiv = true;
            aktuellerAuftrag = neu;
        } else {
            Waschauftrag current = aktuellerAuftrag;

            while (current.naechsterAuftrag != null) {
                current = current.naechsterAuftrag;
            }
            current.naechsterAuftrag = neu;
        }
    }
    public void beendetNaechsterAuftrag() {

        aktuellerAuftrag=aktuellerAuftrag.naechsterAuftrag;
        aktuellerAuftrag.istAktiv=true;
    }
}
