package ru.sberbank;

public class Task1 {

    // Модифицировать класс Developer
    // в методе продемонстрировать реализованную логику
    public static void main(String[] args) {
        int id = 666;
        Developer Aks = new Developer(id);
        System.out.println(Aks.id);
        System.out.println(Aks.isFree);

        Task Core666 = new Task(id, false);
        // разработка
        Aks.addTask(Core666);
        System.out.println(Aks.id);
        System.out.println(Aks.isFree);

        Aks.makeTask();
        System.out.println(Aks.id);
        System.out.println(Aks.isFree);

        Aks.release();
        System.out.println(Aks.id);
        System.out.println(Aks.isFree);

        // тестирование
        int sid = 555;
        Tester Test = new Tester(sid);
        System.out.println("id Тестировщика = " + Test.sid);
        if(Test.isFree == true){
            System.out.println("Тестировщик может взять задачу в тестирование");
        } else {
            System.out.println("Тестировщик тестирует задачу ");
        }

        Test.addTask(Core666);
        System.out.println("id Тестировщика = " + Test.sid);
        if(Test.isFree == true){
            System.out.println("Тестировщик может взять задачу в тестирование");
        } else {
            System.out.println("Тестировщик взял задачу в тестирование ");
        }

        Test.checkTask();
        System.out.println("id Тестировщика = " + Test.sid);
        if(Test.isFree == true){
            System.out.println("Тестировщик может взять задачу в тестирование");
        } else {
            System.out.println("Тестировщик тестирует задачу ");
        }
        Test.release();
        System.out.println("id Тестировщика = " + Test.sid);
        if(Test.isFree == true){
            System.out.println("Тестировщик отсмотрел все задачи");
        } else {
            System.out.println("Тестировщик тестирует задачу ");
        }
    }
}
