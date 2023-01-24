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
        Tester Valentin = new Tester(sid);
        System.out.println(Valentin.name + " id = " + Valentin.sid);
        if(Valentin.isFree == true){
            System.out.println(Valentin.name + " может взять задачу в тестирование");
        } else {
            System.out.println(Valentin.name + " тестирует задачу ");
        }

        Valentin.addTask(Core666);
        System.out.println(Valentin.name + " id = " + Valentin.sid);
        if(Valentin.isFree == true){
            System.out.println(Valentin.name + " может взять задачу в тестирование");
        } else {
            System.out.println(Valentin.name + " взял задачу в тестирование ");
        }

        Valentin.checkTask();
        System.out.println(Valentin.name + " id = " + Valentin.sid);
        if(Valentin.isFree == true){
            System.out.println(Valentin.name + " может взять задачу в тестирование");
        } else {
            System.out.println(Valentin.name + " тестирует задачу ");
        }
        Valentin.release();
        System.out.println(Valentin.name + " id = " + Valentin.sid);
        if(Valentin.isFree == true){
            System.out.println(Valentin.name + " отсмотрел все задачи");
        } else {
            System.out.println(Valentin.name + " тестирует задачу ");
        }


    }

}
