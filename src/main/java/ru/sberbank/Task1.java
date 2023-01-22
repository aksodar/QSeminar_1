package ru.sberbank;

public class Task1 {

    // Модифицировать класс Developer
    // в методе продемонстрировать реализованную логику
    public static void main(String[] args) {
        int id = 1;

        Developer DevNew = new Developer(id);
        System.out.println(DevNew.id);
        System.out.println(DevNew.isFree);

        Task TaskNew = new Task(id, false, false);
        DevNew.addTask(TaskNew);
        System.out.println(DevNew.id);
        System.out.println(DevNew.isFree);

        DevNew.makeTask();
        System.out.println(DevNew.id);
        System.out.println(DevNew.isFree);

        DevNew.release();
        System.out.println(DevNew.id);
        System.out.println(DevNew.isFree);

        //Тестируем задачу

        Tester Test = new Tester(id);
        System.out.println(Test.id);
        System.out.println(Test.isFree);

        Test.addTask(TaskNew);
        System.out.println(Test.id);
        System.out.println(Test.isFree);

        Test.checkTask();
        System.out.println(Test.id);
        System.out.println(Test.isFree);

        Test.release();
        System.out.println(Test.id);
        System.out.println(Test.isFree);

    }

}
