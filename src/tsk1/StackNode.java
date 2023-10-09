package tsk1;

public class StackNode<T> {
    T data; // Дані, які зберігаються в вузлі
    StackNode<T> next; // Вказівник на наступний елемент стеку

    public StackNode(T data) {
        this.data = data;
        this.next = null;
    }
}
