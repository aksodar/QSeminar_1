package ru.sberbank;

public class Task0 {

    // Создать класс Task
    // Создать класс Developer
    // в методе продемонстрировать создание объектов указанных классов и вывести в консоль их параметры
    public static void main(String[] args) {
        int id = 12;
        boolean isDeveloped = true;
        Task x = new Task(id, isDeveloped);
        System.out.println(x.id);
        System.out.println(x.isDeveloped);
    }
}