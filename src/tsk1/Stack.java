package tsk1;

public class Stack<T> {
    private StackNode<T> top;

    public Stack() {
        this.top = null;
    }

    public void push(T data) {
        StackNode<T> newNode = new StackNode<>(data);
        newNode.setNext(top);
        top = newNode;
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("empty");
        }
        T data = top.getData();
        top = top.getNext();
        return data;
    }

    public boolean isEmpty() {
        return top == null;
    }
}
