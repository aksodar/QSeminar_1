package ru.sberbank;

public class HomeTask {

    // Модифицировать класс Task
    // Создать класс Tester
    // в методе продемонстрировать реализованную логику, путем вывода в консоль
    public static void main(String[] args) {
    int id = 8;
    boolean isTested = true;
    Tester Q = new Tester (id);
    System.out.println(Q.id);
    System.out.println(Q.isFree);

    Task a = new Task(id, false, isTested);
    System.out.println(a.id);
    System.out.println(a.isTested);


    }

}
