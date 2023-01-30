package ru.sberbank;

public class Task0 {

    // Создать класс Task
    // Создать класс Developer
    // в методе продемонстрировать создание объектов указанных классов и вывести в консоль их параметры
    public static void main(String[] args) {
        int id = 1;
        boolean isDeveloped = true;
        boolean isTested = true;
        boolean isFree = false;

        Task task = new Task(id, isDeveloped, isTested);
        Developer developer = new Developer(id, isFree);

        System.out.println("Task's id: " + task.getId());
        System.out.println("Is free: " + developer.isFree());
        System.out.println("Is developed: " + task.isDeveloped());
        System.out.println("Developer's id: " + developer.getId());
    }

}
