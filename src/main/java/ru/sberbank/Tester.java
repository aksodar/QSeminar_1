package ru.sberbank;

public class Tester {
    int id;
    Task currentTask;
    boolean isFree;

    public Tester (int id, boolean isFree,Task currentTask){
        this.id = id;
        this.isFree = isFree;
        this.currentTask = currentTask;
    }

    public Tester (int id){
        this.id = id;
        this.isFree = true;
    }


    public boolean addTask(Task a) {
        if (this.isFree == true && this.currentTask == null) {
            this.currentTask = a;
            this.isFree = false;
            return true;
        }
        return false;
    }

    public boolean checkTask() {
            if (this.currentTask != null) {
                this.currentTask.isTested = true;
                return true;
            }
            return false;
        }

    public void release(){
        this.currentTask = null;
        this.isFree = true;
        }
}