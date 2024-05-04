package Compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Person {
    String name;
    int weight;

    public Person(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    public static void main(String[] args) {
        Person s1 = new Person("sdfgvf",12);
        Person s2 = new Person("asd",34);
        Person s3 = new Person("tyj",23);
        ArrayList<Person> people = new ArrayList<>();
        people.add(s1);
        people.add(s2);
        people.add(s3);
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.weight > o2.weight ){
                    return 1;
                } else if (o1.weight < o2.weight) {
                    return -1;
                }

                return o1.name.compareTo(o2.name);
            }
        });
        System.out.println(people);
    }



}
