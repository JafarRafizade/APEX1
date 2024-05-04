package Exam;

public class DuplicateTaskException extends Exception{
    public DuplicateTaskException() {
        super("This task is already present");
    }
}
