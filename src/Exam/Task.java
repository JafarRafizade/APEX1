package Exam;

import java.util.Objects;

public class Task implements Comparable<Task> {
    private  String text;
    private PriorityLevel priority;



    public Task(String text, int hours) {
        this.text = text;

        if (hours > 8) {
            priority = PriorityLevel.HIGH;
        }

        if (hours <= 8) {
            priority = PriorityLevel.MEDIUM;
        }
        if (hours <= 4) {
            priority = PriorityLevel.LOW;

        }


    }

    public String getText() {
        return text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(text, task.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text);
    }

    @Override
    public String toString() {
        return "Task{" +
                "text='" + text + '\'' +
                ", priority=" + priority ;}

    @Override
    public int compareTo(Task o) {
        return Integer.compare(this.priority.ordinal(),o.priority.ordinal());
    }
}

