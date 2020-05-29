package com.testtasks.task4;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        /*
        Рефлексия в Java осуществляется с помощью Java Reflection API.
        Рефлекися - это механизм, исследующий данные программы во время
        ее выполнения и позволяющий заглянуть в информацию о полях, методах
        и конструкторах классов.
        */

        // Создание экземпляра класса
        MyClass myClass = new MyClass();
        // Инициилизация переменных для храниения данных из приватных полей
        int num = 0;
        String string = null;

        try {
            // Получаем методы класса MyClass
            Method setNumMethod = myClass.getClass().getDeclaredMethod("setNum", int.class);
            Method setStringMethod = myClass.getClass().getDeclaredMethod("setString", String.class);
            // Метод setAccessible позволяет нам дальше работать с полученными методами класса
            setNumMethod.setAccessible(true);
            setStringMethod.setAccessible(true);
            // Вызываем полученные методы и передаем туда аргументы
            setNumMethod.invoke(myClass, 3);
            setStringMethod.invoke(myClass, "text");

        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) { e.printStackTrace(); }

        try {
            // Получаем приватные поля
            Field numField = myClass.getClass().getDeclaredField("num");
            Field stringField = myClass.getClass().getDeclaredField("string");
            // Делаем их доступными для дальнейшей работы с ними
            numField.setAccessible(true);
            stringField.setAccessible(true);
            // Получаем значения этих полей
            num = (int) numField.get(myClass);
            string = (String) stringField.get(myClass);

        } catch (NoSuchFieldException | IllegalAccessException e) { e.printStackTrace(); }

        System.out.println(num + " " + string);
    }
}
