package Generics;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        Pair<Integer, String> pair = new Pair<>(1, "string");

        System.out.println(pair.getValue());

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("pear");
        fruits.set(0,"watermelon");
        fruits.remove(1);
        for (String i : fruits){
            System.out.println(i);
        }

        Set<String> set = new HashSet<>();
        set.add("1");
        set.add("2");
        set.add("3");
        set.add("1");  // Duplicate element, will be ignored

        for (String nums : set) {
            System.out.println(nums);
        }
        Queue<String> queue = new LinkedList<>();
        queue.add("Task1");
        queue.add("Task2");
        queue.add("Task3");

        System.out.println("Processing tasks:");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }

}
