package ru.sberbank;

public class Task0 {

    // Создать класс Task
    // Создать класс Developer
    // в методе продемонстрировать создание объектов указанных классов и вывести в консоль их параметры
    public static void main(String[] args) {
        int i = 13;
        boolean test = false;
        Task t = new Task(i, test);

        System.out.println(t.id);
        System.out.println(t.isDeveloped);
    }
}
