package classwork;

public class Holder<T, U, V> {
    public T slot1;
    public U slot2;
    public V slot3;
    public Holder<U, V, T> meta;

    public Holder(T a, U b, V c) {
        slot1 = a;
        slot2 = b;
        slot3 = c;
    }

    @Override
    public String toString() {
        return slot1.toString() + " " + slot2.toString() + " " + slot3.toString();
    }
}