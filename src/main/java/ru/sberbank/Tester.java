package ru.sberbank;


public class Tester {
    int id;
    Task currentTask;
    boolean isFree;

    public Tester(int id, boolean isFree) {
        this.id = id;
        this.isFree = isFree;
    }

    public Tester (int id) {
        this.id = id;
        this.isFree = true;
    }

    public boolean addTask(Task test) {
        if (this.isFree == true && this.currentTask == null && Developer.isFree) {
            this.currentTask = test;
            this.isFree = false;
            return true;
        } return false;
    }

    public Task checkTask() {
        if (this.currentTask != null) {
            this.currentTask.isTested = true;
            this.isFree = false;
        } return currentTask;
    }

    public void release() {
        this.isFree = true;
        this.currentTask = null;
    }
}
