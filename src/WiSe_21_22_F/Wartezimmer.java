package WiSe_21_22_F;

public interface Wartezimmer {
    public void betreteWartezimmer(Patient patient);
    public int wievieleWarten();
    public Patient derNaechsteBitte() throws WartezimmerEmpty;
}