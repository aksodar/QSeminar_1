package ru.sberbank;

public class Task1 {

    // Модифицировать класс Developer
    // в методе продемонстрировать реализованную логику
    public static void main(String[] args) {
        int id = 1;

        Developer d = new Developer(id);

        System.out.println(d.id);
        System.out.println(d.isFree);

        Task t = new Task(id, false, false);
        d.addTask(t);
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
