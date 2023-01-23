package ru.sberbank;

public class Task1 {

    // Модифицировать класс Developer
    // в методе продемонстрировать реализованную логику
    public static void main(String[] args) {
        int i = 33;

        Developer d = new Developer(i);

        System.out.println(d.id);
        System.out.println(d.isFree);

        Task t9 = new Task(i, false);

        d.addTask(t9);
        System.out.println(d.id);
        System.out.println(d.isFree);

        d.makeTask();
        System.out.println(d.id);
        System.out.println(d.isFree);

        d.release();
        System.out.println(d.id);
        System.out.println(d.isFree);

    }
}