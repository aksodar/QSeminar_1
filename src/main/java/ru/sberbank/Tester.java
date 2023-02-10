package ru.sberbank;

public class Tester {
    int id;
    Task currentTask;
    boolean isFree;

    public Tester(int id) {
        this.id = id;
        this.isFree = true;
    }

    public boolean addTask(Task task) {
        if (this.isFree && task.isDeveloped && !task.isTested) {
            this.currentTask = task;
            this.isFree = false;
            return true;
        }
        return false;
    }

    public Task checkTask() {
        if (this.currentTask != null) {
            this.currentTask.isTested = true;
        }
        return this.currentTask;
    }

    public void release() {
        this.isFree = true;
        this.currentTask = null;
    }

    @Override
    public String toString() {
        return "Tester{" +
                "id=" + id +
                ", currentTask=" + currentTask +
                ", isFree=" + isFree +
                '}';
    }
}
