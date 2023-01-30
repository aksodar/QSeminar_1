package ru.sberbank;

public class Tester {
    int id;
    Task currentTask;
    boolean isFree;

    public Tester(int id) {
        this.id = id;
        this.isFree = true;
    }

    public Tester(int id, boolean isFree) {
        this.id = id;
        this.isFree = isFree;
    }

    public boolean addTask(Task incident) {
        if (this.isFree == true && this.currentTask == null) {
            this.currentTask = incident;
            this.isFree = false;
            return true;
        }
        return false;
    }

    public Task checkTask() {
        if (this.currentTask != null && this.currentTask.isDeveloped == true /*протестировать можно только задачу, которая была разработана*/) {
            this.currentTask.isTested = true;
        }
        return currentTask;
    }

    public void release() {
        this.isFree = true;
        this.currentTask = null;
    }
}