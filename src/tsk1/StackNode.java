package tsk1;

public class StackNode<T> {
    private T data; // Дані, які зберігаються в вузлі
    private StackNode<T> next; // Вказівник на наступний елемент стеку

    public StackNode(T data) {
        this.data = data;
        this.next = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public StackNode<T> getNext() {
        return next;
    }

    public void setNext(StackNode<T> next) {
        this.next = next;
    }
}
