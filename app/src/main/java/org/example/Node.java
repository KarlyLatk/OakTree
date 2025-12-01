package org.example;

public class Node<T> {
    T data;
    Node<T> left;
    Node<T> right;

    public Node (T object) {
        data = object;
    }

    public void set_left(Node<T> node) {
        left = node;
    }
    public void set_right(Node<T> node) {
        right = node;
    }

    public Node<T> left() {
        return left;
    }

    public Node<T> right() {
        return right;
    }

    public T getData() {
        return data;
    }
}
