import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack<Character> letters = new Stack<>();
        letters.push('a');
        letters.push('b');
        letters.push('c');
        letters.pop();
        System.out.println(letters);
    }
}
