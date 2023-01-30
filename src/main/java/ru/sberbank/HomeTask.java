package ru.sberbank;

public class HomeTask {

    // Модифицировать класс Task
    // Создать класс Tester
    // в методе продемонстрировать реализованную логику, путем вывода в консоль
    public static void main(String[] args) {
        int id = 1;
        Tester qa = new Tester(id);
        System.out.println(qa.id);
        System.out.println(qa.isFree);
        Task story = new Task(id, false, false); //задача НЕ разработана, а значит, не готова к тестированию
        qa.addTask(story);
        System.out.println(qa.id);
        System.out.println(qa.isFree);
        qa.checkTask();
        System.out.println(qa.id);
        System.out.println(qa.isFree);
        System.out.println(story.isTested); //так как задача не была разработана, в выводе будет false
        Developer petr = new Developer(id);
        petr.addTask(story); //передаем задачу раработчику
        System.out.println(petr.id);
        System.out.println(petr.isFree);
        petr.makeTask(); //разработчик выполнил задачу
        System.out.println(petr.id);
        System.out.println(petr.isFree);
        qa.checkTask();
        System.out.println(qa.id);
        System.out.println(qa.isFree);
        System.out.println(story.isTested); //теперь, после выполнения задачи разработчиком, ее можно протестировать - в выводе будет true
        qa.release();
        System.out.println(qa.id);
        System.out.println(qa.isFree);
    }

}
