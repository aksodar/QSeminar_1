package ru.sberbank;

public class Task0 {

    // Создать класс Task
    // Создать класс Developer
    // в методе продемонстрировать создание объектов указанных классов и вывести в консоль их параметры
    public static void main(String[] args) {
        int id = 5;
        boolean isDevelop = true;

        boolean isTested = false;
        Task x = new Task(id, isDevelop, isTested);

        System.out.println(x.id);
        System.out.println(x.isDeveloped);
    }

}
