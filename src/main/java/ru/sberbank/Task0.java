package ru.sberbank;

public class Task0 {

    // Создать класс Task
    // Создать класс Developer
    // в методе продемонстрировать создание объектов указанных классов и вывести в консоль их параметры
    public static void main(String[] args) {
        int id = 5;
        boolean isDeveloped = true;
        boolean isTested = true;

        Task TaskNew = new Task(id, isDeveloped, isTested);
        System.out.println(TaskNew.id);
        System.out.println(TaskNew.isDeveloped);
        System.out.println(TaskNew.isTested);

    }

}