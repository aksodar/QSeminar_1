package ru.sberbank;

public class Tester {
    int id;
    boolean isFree;
    Task currentTask;

    public Tester (int id) {
        this.id = id;
        this.isFree = true;
    }

    public boolean addTask(Task t) {
        if (this.isFree == true && this.currentTask == null) {
            this.currentTask = t;
            this.isFree = false;
            return true;
        }
        return false;
    }

    public Task checkTask() {
        if (this.currentTask != null) {
            this.currentTask.isDeveloped = true;
        }
        return currentTask;
    }

    public void release() {
        this.currentTask = null;
        this.isFree = true;
    }
}
