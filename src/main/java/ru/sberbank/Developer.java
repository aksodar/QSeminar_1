package ru.sberbank;

public class Developer {
    int id;
    boolean isFree;
    Task currentTask;

    public Developer(int id, boolean isFree) {
        this.id = id;
        this.isFree = isFree;
    }

    public Developer(int id) {
        this.id = id;
        this.isFree = true;
    }

    public boolean addTask(Task x) {
        if (this.isFree == true && this.currentTask == null) {
           this.currentTask = x;
           this.isFree = false;
           return true;
        }
        return false;
    }

    public Task makeTask() {
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
