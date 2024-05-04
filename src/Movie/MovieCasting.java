package Movie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MovieCasting {
    public static void main(String[] args) {
        List<Actor> actors = new ArrayList<>();
        actors.add(new Actor("Brad Pitt", 60, 90));
        actors.add(new Actor("Matthew McConaughey", 54, 95));
        actors.add(new Actor("Rebecca Ferguson", 40, 82));
        actors.add(new Actor("Timothee Chalamet", 28, 80));

        List<Role> roles = new ArrayList<>();
        roles.add(new Role("Paul Atreides", 25, 78));
        roles.add(new Role("Rust Cohle", 30, 90));
        roles.add(new Role("Tyler Durden", 35, 85));
        roles.add(new Role("Lady Jessica", 37, 80));



        actors.sort(new Comparator<Actor>() {
            @Override
            public int compare(Actor a1, Actor a2) {
                if (a1.age > a2.age) {
                    return 1;
                } else if (a1.age < a2.age) {
                    return -1;
                }
                return Integer.compare(a1.actingSkill, a2.actingSkill);
            }
        });


        roles.sort(new Comparator<Role>() {
            @Override
            public int compare(Role r1, Role r2) {
                if (r1.expectedAge > r2.expectedAge) {
                    return 1;
                } else if (r1.expectedAge < r2.expectedAge) {
                    return -1;
                }
                return Integer.compare(r1.minSkill, r2.minSkill);
            }
        });



        for (Role role : roles) {
            for (Actor actor : actors) {
                if (actor.age >= role.expectedAge && actor.actingSkill >= role.minSkill) {
                    System.out.println("Role: " + role.name + " - Actor: " + actor.name);
                 actors.remove(actor);
                    break;
                }
            }
        }
    }
}
