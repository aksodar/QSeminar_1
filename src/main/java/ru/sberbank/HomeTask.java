package ru.sberbank;

public class HomeTask {

    // Модифицировать класс Task
    // Создать класс Tester
    // в методе продемонстрировать реализованную логику, путем вывода в консоль
    public static void main(String[] args) {

        System.out.println("Создаём объекты");
        Developer developer = new Developer(1);
        Tester tester = new Tester(2);
        Task task = new Task(123, false);

        System.out.println(developer);
        System.out.println(tester);
        System.out.println(task + "\n");

        System.out.println("Пробуем сразу передать задачу тестеру, результат: " + tester.addTask(task) + "\n");

        System.out.println("Пробуем передать задачу разработчику, результат: " + developer.addTask(task));
        System.out.println(developer);
        System.out.println(task + "\n");

        System.out.println("Завершаем разработку задачи, результат: " + developer.makeTask().isDeveloped + "\n");

        System.out.println("Освобождаем разработчика");
        developer.release();
        System.out.println(developer);
        System.out.println(task + "\n");

        System.out.println("Т.к. задача разработана, передаём на тестирование. Результат: " + tester.addTask(task));
        System.out.println(task);
        System.out.println(tester + "\n");

        System.out.println("Завершаем тестирование задачи, результат: " + tester.checkTask().isTested);
        System.out.println(task);
        System.out.println(tester + "\n");

        System.out.println("Освобождаем тестера");
        tester.release();
        System.out.println(tester);


    }

}
