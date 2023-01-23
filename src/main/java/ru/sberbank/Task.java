package ru.sberbank;

public class Task {
    int id;
    boolean isDeveloped;
    boolean isTested;
    String summary;

    public Task(int id, boolean isDeveloped) {
        this.id = id;
        this.isDeveloped = isDeveloped;
    }
}
