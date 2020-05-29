package com.testtasks.task1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        Random random = new Random();
        int max = 100;
        int min = 1;

        for (int i = 0; i < 100; i++) binaryTree.add(random.nextInt(max - min + 1) + min);

        System.out.println("Binary Tree sum is: " + binaryTree.sum());
    }
}
