package ru.sberbank;

public class Tester {
    int id;
    Task currentTask;
    boolean isFree;

    public Tester(int id) {
        this.id = id;
        this.isFree = true;
    }

    public boolean addTask(Task t) {
        if(this.isFree && this.currentTask == null) {
            this.currentTask = t;
            this.isFree = false;
            return true;
        }
        return false;
    }

    public Task makeTask() {
        if (this.currentTask != null) {
            this.currentTask.isDeveloped = true;
        }
        return this.currentTask;
    }

    public void release() {
        this.currentTask = null;
        this.isFree = true;
    }
}
