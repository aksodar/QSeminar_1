package ru.sberbank;

public class HomeTask {

    // Модифицировать класс Task
    // Создать класс Tester
    // в методе продемонстрировать реализованную логику, путем вывода в консоль
    public static void main(String[] args) {
        int id = 1;

        Tester tester = new Tester(id);
        System.out.println(tester.id);
        System.out.println(tester.isFree);

        Task task = new Task(id, false, false);
        tester.addTask(task);
        System.out.println(tester.id);
        System.out.println(tester.isFree);
        tester.checkTask();
        System.out.println(tester.id);
        System.out.println(tester.isFree);
        tester.release();
        System.out.println(tester.id);
        System.out.println(tester.isFree);

    }

}
