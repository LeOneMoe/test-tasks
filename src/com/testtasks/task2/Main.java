package com.testtasks.task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 100; i++) nums.add(i);

        // Если не надо изменять элементы
        nums.forEach(n -> System.out.println(n * n));

        // Если надо изменять элементы
        for (int i = 0; i < nums.size(); i++) nums.set(i, (int) Math.pow(nums.get(i), 2));
        nums.forEach(System.out::println);
    }
}
