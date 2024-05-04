package Generics;

public class Pair <T,Y> {
    public T value;
    public Y value1;

    public Pair(T value, Y value1) {
        this.value = value;
        this.value1 = value1;
    }

    public T getValue() {
        return value;
    }

    public Y getValue1() {
        return value1;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void setValue1(Y value1) {
        this.value1 = value1;
    }
}
