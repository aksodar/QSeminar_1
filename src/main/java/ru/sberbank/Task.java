package ru.sberbank;

public class Task {
    int id;
    boolean isDeveloped;
    boolean isTested;

    public Task(int id, boolean isDeveloped) {
        this.id = id;
        this.isDeveloped = isDeveloped;
        this.isTested = false;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", isDeveloped=" + isDeveloped +
                ", isTested=" + isTested +
                '}';
    }
}
