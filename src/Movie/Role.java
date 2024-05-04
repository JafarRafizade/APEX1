package Movie;

public class Role {
    String name;
    int expectedAge;
    int minSkill;

    public Role(String name, int expectedAge, int minSkill) {
        this.name = name;
        this.expectedAge = expectedAge;
        this.minSkill = minSkill;
    }

    @Override
    public String toString() {
        return "Role{" +
                "name='" + name + '\'' +
                ", expectedAge=" + expectedAge +
                ", minSkill=" + minSkill +
                '}';
    }
}
