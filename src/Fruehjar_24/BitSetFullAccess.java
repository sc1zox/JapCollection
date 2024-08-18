package Fruehjar_24;

public interface BitSetFullAccess extends BitSetReadOnly{

    void expand(int n);
    void set(int index);
    void clear(int index);
    void flip(int index);
    void printArray();
}
