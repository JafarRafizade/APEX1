package SlackvsHeap;

public class Main {
    public static void main(String[] args) throws Throwable {
        MemoryDemo memory = new MemoryDemo(2,4);
        memory = null;
        memory.finalize();
        System.out.println(memory);

    }
}
