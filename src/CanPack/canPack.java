package CanPack;

public class canPack {
    int bigCount;
    int smallCount;
    int goal;
    boolean possible;

    public canPack(int bigCount, int smallCount, int goal) {
        this.bigCount = bigCount;
        this.smallCount = smallCount;
        this.goal = goal;
    }

    @Override
    public String toString() {
        return "canPack{" +
                "bigCount=" + bigCount +
                ", smallCount=" + smallCount +
                ", goal=" + goal +
                ", possible=" + possible +
                '}';
    }
}


