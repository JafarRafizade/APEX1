package Exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TaskManager  {
    List<Task> tasks = new ArrayList<>();



    void addTask (Task task) throws DuplicateTaskException{

        if (tasks.contains(task)) {

            throw new DuplicateTaskException();
        }
        else tasks.add(task);

    }
    void removeTask (String text) {
        tasks.removeIf(p -> p.getText().equalsIgnoreCase(text));

    }




    @Override
    public String toString() {
        Collections.sort(tasks);

        return "TaskManager{" +
                "tasks=" + tasks +
                '}';
    }



}


