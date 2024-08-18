package WiSe_22_23_S;

public interface Wartezimmer {

    void betreteWartezimmer(Patient patient);
    int wievieleWarten();
    Patient derNaechsteBitte() throws NiemandDaException;
}
