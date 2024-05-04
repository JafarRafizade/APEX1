package Movie;

public class Actor {
    String name;
    int age;
    int actingSkill;

    public Actor(String name, int age, int actingSkill) {
        this.name = name;
        this.age = age;
        this.actingSkill = actingSkill;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", actingSkill=" + actingSkill +
                '}';
    }
}
