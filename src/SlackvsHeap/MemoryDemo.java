package SlackvsHeap;

public class MemoryDemo {
    int a;
    int b;

    public MemoryDemo(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int calculateInt (int a, int b) {
        return a + b;
    }

    @Override
    public String toString() {
        return "MemoryDemo{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}


