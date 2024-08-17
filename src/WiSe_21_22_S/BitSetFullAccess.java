package WiSe_21_22_S;

public interface BitSetFullAccess extends BitSetReadOnly{

    boolean[] expand(int n);
    void set(int index);
    void clear(int index);
    void flip(int index);
}
