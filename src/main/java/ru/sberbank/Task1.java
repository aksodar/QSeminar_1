package ru.sberbank;

public class Task1 {

    // Модифицировать класс Developer
    // в методе продемонстрировать реализованную логику
    public static void main(String[] args) {
        int id = 5;
        boolean isDevelop = true;
        Developer devRoma = new Developer(id);
        Tester testRoma = new Tester(id);

        System.out.println(devRoma.id);
        System.out.println(devRoma.isFree);
        System.out.println(testRoma.isFree);

        Task task = new Task(id, false, false);
        devRoma.addTask(task);
        System.out.println(devRoma.id);
        System.out.println(devRoma.isFree);
        System.out.println(testRoma.isFree);
        devRoma.makeTask();
        System.out.println(devRoma.id);
        System.out.println(devRoma.isFree);
        System.out.println(testRoma.isFree);
        devRoma.release();
        System.out.println(devRoma.id);
        System.out.println(devRoma.isFree);
        System.out.println(testRoma.isFree);
        testRoma.addTask(task);
        System.out.println(devRoma.id);
        System.out.println(devRoma.isFree);
        System.out.println(testRoma.isFree);
        testRoma.checkTask();
        System.out.println(devRoma.id);
        System.out.println(devRoma.isFree);
        System.out.println(testRoma.isFree);
        testRoma.release();
        System.out.println(devRoma.id);
        System.out.println(devRoma.isFree);
        System.out.println(testRoma.isFree);

    }

}
