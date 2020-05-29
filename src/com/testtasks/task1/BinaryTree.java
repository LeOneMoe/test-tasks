package com.testtasks.task1;

public class BinaryTree {
    public Node root;

    private Node addRecursive(Node current, int value) {
        if (current == null) return new Node(value);

        if (value < current.value) current.left = addRecursive(current.left, value);
        else if (value > current.value) current.right = addRecursive(current.right, value);
        else return current;

        return current;
    }

    public void add(int value) {
        root = addRecursive(root, value);
    }

    private int sumRecursive(Node current)
    {
        if (current == null) return 0;

        return current.value + sumRecursive(current.left) + sumRecursive(current.right);
    }

    public int sum() {
        return sumRecursive(root);
    }
}
