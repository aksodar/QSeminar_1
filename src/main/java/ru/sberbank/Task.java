package ru.sberbank;

public class Task {
    private int id;
    private boolean isDeveloped;
    private boolean isTested;

    public Task (int id, boolean isDeveloped, boolean isTested) {
        this.id = id;
        this.isDeveloped = isDeveloped;
        this.isTested = isTested;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public boolean isDeveloped() {
        return isDeveloped;
    }

    public void setDeveloped(final boolean developed) {
        this.isDeveloped = developed;
    }

    public boolean isTested() {
        return isTested;
    }

    public void setTested(final boolean tested) {
        this.isTested = tested;
    }
}