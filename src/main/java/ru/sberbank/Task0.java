package ru.sberbank;

public class Task0 {

    // Создать класс Task
    // Создать класс Developer
    // в методе продемонстрировать создание объектов указанных классов и вывести в консоль их параметры
    public static void main(String[] args) {
        int id = 10;
        boolean isDeveloped = true;
        boolean isTested = false;
        Task lesson = new Task(id, isDeveloped, isTested);
        System.out.println(lesson.id);
        System.out.println(lesson.isDeveloped);
    }

}
