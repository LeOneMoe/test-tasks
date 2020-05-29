package com.testtasks.task4;

public class MyClass {
    private int num;
    private String string;

    public MyClass() {
    }

    private MyClass(int num, String string) {
        this.num = num;
        this.string = string;
    }

    private int getNum() {
        return num;
    }

    private void setNum(int num) {
        this.num = num;
    }

    private String getString() {
        return string;
    }

    private void setString(String string) {
        this.string = string;
    }
}
