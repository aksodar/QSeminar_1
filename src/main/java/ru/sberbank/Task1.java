package ru.sberbank;

public class Task1 {

    // Модифицировать класс Developer
    // в методе продемонстрировать реализованную логику
    public static void main(String[] args) {

        boolean add_task_result;

        Task task = new Task(1, false);
        Developer developer = new Developer(10);
        System.out.println("Разаработчик: id=" + developer.id + ", свободен ли он: " + developer.isFree + ", задача: " + developer.currentTask);
        System.out.println("Задание: id=" + task.id + ", статус выполнения: " + task.isDeveloped + "\n");

        System.out.println("Добавим задачу разработчику");
        System.out.println("Результат добавления задачи: " + developer.addTask(task));
        System.out.println("Разаработчик: id=" + developer.id + ", свободен ли он: " + developer.isFree + ", задача: " + developer.currentTask);
        System.out.println("Задание: id=" + task.id + ", статус выполнения: " + task.isDeveloped + "\n");

        System.out.println("Добавим задачу разработчику ещё раз");
        System.out.println("Результат добавления задачи: " + developer.addTask(task));
        System.out.println("Разаработчик: id=" + developer.id + ", свободен ли он: " + developer.isFree + ", задача: " + developer.currentTask);
        System.out.println("Задание: id=" + task.id + ", статус выполнения: " + task.isDeveloped + "\n");

        System.out.println("Выполним задачу");
        System.out.println("Статус выполнения задачи: " + developer.makeTask().isDeveloped);
        System.out.println("Разаработчик: id=" + developer.id + ", свободен ли он: " + developer.isFree + ", задача: " + developer.currentTask);
        System.out.println("Задание: id=" + task.id + ", статус выполнения: " + task.isDeveloped + "\n");

        System.out.println("Освободим разработчика");
        developer.release();
        System.out.println("Разаработчик: id=" + developer.id + ", свободен ли он: " + developer.isFree + ", задача: " + developer.currentTask);
        System.out.println("Задание: id=" + task.id + ", статус выполнения: " + task.isDeveloped + "\n");


    }

}
