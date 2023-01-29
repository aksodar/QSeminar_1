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

        Task t = new Task(id, isDeveloped, isTested);
        Developer d = new Developer(id, isFree);

        System.out.println("Задание с id: " + t.id);
        System.out.println("разрабатывается: " + t.isDeveloped);
        System.out.println("Разработчик с id: " + d.id);
        System.out.println("свободен: " + d.isFree);

    }

}
