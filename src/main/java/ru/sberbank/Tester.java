package ru.sberbank;

public class Tester {
    int id;
    boolean isFree;
    Task currentTask;

    public Tester(int id, boolean isFree) {
        this.id = id;
        this.isFree = isFree;
    }

    public Tester(int id) {
        this.id = id;
        this.isFree = true;
    }

    public boolean addTask(Task x) {
        if (this.isFree == true && this.currentTask == null) {
            this.currentTask = x;
            this.isFree = false;
            return true;
        }
        return true;
    }

    public Task checkTask() {
        if (this.currentTask != null && this.currentTask.isDeveloped == true && this.currentTask.isTested == false) {
            this.currentTask.isTested = true;
        }
        return currentTask;
    }

    public void release() {
        this.currentTask = null;
        this.isFree = true;
    }

}
