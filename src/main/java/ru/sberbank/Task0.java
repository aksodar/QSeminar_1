package ru.sberbank;

public class Task0 {

    // Создать класс Task
    // Создать класс Developer
    // в методе продемонстрировать создание объектов указанных классов и вывести в консоль их параметры
    public static void main(String[] args) {
        int id1 = 0;
        boolean isDeveloper = true;

        Task task1 = new Task(id1, isDeveloper);

        Developer developer = new Developer(10, true);


        System.out.println(task1.id);
        System.out.println(task1.isDeveloped);

        System.out.println(developer.id);
        System.out.println(developer.isFree);

    }

}
