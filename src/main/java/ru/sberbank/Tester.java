package ru.sberbank;

public class Tester {
    private int id;
    private Task currentTask;
    private boolean isFree;

    public Tester(int id, boolean isFree) {
        this.id = id;
        this.isFree = isFree;
    }

    public Tester(int id) {
        this.id = id;
        this.isFree = true;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public Task getCurrentTask() {
        return currentTask;
    }

    public void setCurrentTask(final Task currentTask) {
        this.currentTask = currentTask;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(final boolean free) {
        isFree = free;
    }

    public boolean addTask(Task test) {
        if (this.isFree == true && this.currentTask == null && test.isDeveloped()) {
            this.currentTask = test;
            this.isFree = false;
            return true;
        }
        return false;
    }

    public Task checkTask() {
        if (this.currentTask != null) {
            this.currentTask.setTested(true);
            this.isFree = false;
        }
        return currentTask;
    }

    public void release() {
        this.isFree = true;
        this.currentTask = null;
    }
}
