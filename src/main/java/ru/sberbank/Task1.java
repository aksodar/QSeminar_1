package ru.sberbank;

public class Task1 {

    // Модифицировать класс Developer
    // в методе продемонстрировать реализованную логику
    public static void main(String[] args) {
        int id = 10;
        Developer ivan = new Developer(id);
        System.out.println(ivan.id);
        System.out.println(ivan.isFree);
        Task bug = new Task(id, false, false);
        ivan.addTask(bug);
        System.out.println(ivan.id);
        System.out.println(ivan.isFree);
        ivan.makeTask();
        System.out.println(ivan.id);
        System.out.println(ivan.isFree);
        ivan.release();
        System.out.println(ivan.id);
        System.out.println(ivan.isFree);
    }

}
