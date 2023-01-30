package ru.sberbank;

public class Task {
    int id;
    boolean isDeveloped;
    boolean isTested;

    public Task (int id, boolean isDeveloped, boolean isTested) {
        this.id = id;
        this.isDeveloped = isDeveloped;
        this.isTested = isTested;
    }
}
