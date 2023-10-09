package tsk1;
// Stack.java
import tsk1.StackNode;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Stack<T> implements Iterable<T> {
    private StackNode<T> top; // Вершина стеку

    public Stack() {
        this.top = null;
    }

    // Метод для додавання елементу на вершину стеку
    public void push(T data) {
        StackNode<T> newNode = new StackNode<>(data);
        newNode.next = top;
        top = newNode;
    }

    // Метод для видалення елементу з вершини стеку
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек порожній");
        }
        T data = top.data;
        top = top.next;
        return data;
    }

    // Метод для перевірки, чи є стек порожнім
    public boolean isEmpty() {
        return top == null;
    }

    // Реалізація інтерфейсу Iterable<T>
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private StackNode<T> current = top;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                T data = current.data;
                current = current.next;
                return data;
            }
        };
    }
}
