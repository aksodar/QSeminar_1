package ru.sberbank;

public class Developer {
    int id;
    boolean isFree;
    Task currentTask;

    public Developer(int id) {
        this.id = id;
        this.isFree = true;
    }

    public Developer(int id, boolean isFree) {
        this.id = id;
        this.isFree = isFree;
    }

    public boolean addTask(Task issue) {
        if (this.isFree == true && this.currentTask == null) {
            this.currentTask = issue;
            this.isFree = false;
            return true;
        }
        return false;
    }

    public Task makeTask(){
        if (this.currentTask != null) {
            this.currentTask.isDeveloped = true;
        }
        return currentTask;
    }

    public void release() {
        this.isFree = true;
        this.currentTask = null;
    }
}
