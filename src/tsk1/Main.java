package tsk1;
//import tsk1.Stack;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Додавання елементів до стеку
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Обхід стеку та виведення елементів
        for (int item : stack) {
            System.out.println(item);
        }
    }
}
