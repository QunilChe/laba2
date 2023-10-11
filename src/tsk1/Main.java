package tsk1;
//import tsk1.Stack;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();


        stack.push(1);
        stack.push(2);
        stack.push(3);


        for (int item : stack) {
            System.out.println(item);
        }
    }
}
