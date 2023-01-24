package ru.sberbank;

public class Tester {
    int sid;
    Task currentTask;
    boolean isFree;
    String name = "Valentin";

    public Tester (int sid, boolean isFree){
        this.sid = sid;
        this.isFree = isFree;
    }

    public Tester (int sid){
        this.sid = sid;
        this.isFree = true;

    }

    public boolean addTask(Task y){
        if(this.isFree == true && this.currentTask == null){
            this.currentTask = y;
            this.isFree = false;
            return true;
        }
        return false;
    }

    public Task checkTask(){
        if(this.currentTask != null && this.currentTask.isDeveloped == true && this.currentTask.isTested == false){
            this.currentTask.isTested = true;
        }
        return currentTask;
    }

    public void release(){
        this.currentTask = null;
        this.isFree = true;
    }
}