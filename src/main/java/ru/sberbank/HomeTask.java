package ru.sberbank;

public class HomeTask {

    // Модифицировать класс Task
    // Создать класс Tester
    // в методе продемонстрировать реализованную логику, путем вывода в консоль
    public static void main(String[] args) {

        Developer developer = new Developer(1);
        Tester tester = new Tester(2);
        Task task = new Task(3, false, false);

        System.out.println("Before");
        System.out.println("Developer's id: " + developer.getId());
        System.out.println("Developer is free: " +  developer.isFree());
        System.out.println("Tester's id: " + tester.getId());
        System.out.println("Tester is free: " +  tester.isFree());
        System.out.println("Task is developed: " + task.isDeveloped());
        System.out.println("Task is tested: " + task.isTested());
        System.out.println();

        System.out.println("add task to developer");
        developer.addTask(task);
        System.out.println("Developer is free: " +  developer.isFree());
        System.out.println("Tester is free: " +  tester.isFree());
        System.out.println("Task is developed: " + task.isDeveloped());
        System.out.println("Task is tested: " + task.isTested());
        System.out.println();

        System.out.println("make task and release");
        developer.makeTask();
        developer.release();
        System.out.println("Developer is free: " +  developer.isFree());
        System.out.println("Tester is free: " +  tester.isFree());
        System.out.println("Task is developed: " + task.isDeveloped());
        System.out.println("Task is tested: " + task.isTested());

        System.out.println("add task to tester");
        tester.addTask(task);
        System.out.println("Tester is free: " +  tester.isFree());
        System.out.println("Task is developed: " + task.isDeveloped());
        System.out.println("Task is tested: " + task.isTested());
        System.out.println();

        System.out.println("check task and release");
        tester.checkTask();
        tester.release();
        System.out.println("Tester is free: " +  tester.isFree());
        System.out.println("Task is developed: " + task.isDeveloped());
        System.out.println("Task is tested: " + task.isTested());
        System.out.println();
    }


}
