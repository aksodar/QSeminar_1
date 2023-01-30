package ru.sberbank;

public class Task1 {

    // Модифицировать класс Developer
    // в методе продемонстрировать реализованную логику
    public static void main(String[] args) {
        Developer developer = new Developer(123);
        Task task = new Task(321, false, false);

        System.out.println("Before");
        System.out.println("Developer's id: " + developer.getId());
        System.out.println("Developer is free: " + developer.isFree());
        System.out.println("Task is developed: " + task.isDeveloped());
        System.out.println();

        developer.addTask(task);
        System.out.println("add task");
        System.out.println("Developer's id: " + developer.getId());
        System.out.println("Developer is free: " + developer.isFree());
        System.out.println("Task is developed: " + task.isDeveloped());
        System.out.println();

        developer.makeTask();
        System.out.println("make task");
        System.out.println("Developer's id: " + developer.getId());
        System.out.println("Developer is free: " + developer.isFree());
        System.out.println("Task is developed: " + task.isDeveloped());
        System.out.println();

        developer.release();
        System.out.println("Release");
        System.out.println("Developer's id: " + developer.getId());
        System.out.println("Developer is free: " + developer.isFree());
        System.out.println("Task is developed: " + task.isDeveloped());
    }

}
