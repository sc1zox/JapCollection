package WiSe_18_19_S;

public class Waschauftrag {
    public byte programmNr;
    public boolean istAktiv;
    public Waschauftrag naechsterAuftrag;

    public Waschauftrag(byte programmNr) {
        this.programmNr = programmNr;
        istAktiv = false;
        naechsterAuftrag = null;
    }
}