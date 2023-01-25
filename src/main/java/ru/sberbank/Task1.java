package ru.sberbank;

public class Task1 {

    // Модифицировать класс Developer
    // в методе продемонстрировать реализованную логику
    public static void main(String[] args) {
    int id = 12;
    Developer d = new Developer(id);
        System.out.println (d.id);
        System.out.println  (d.isFree);

        Task t = new Task(id,false, true);
        System.out.println (t.id);
        System.out.println (t.isDeveloped);
        System.out.println (t.isTested);



    }

}
