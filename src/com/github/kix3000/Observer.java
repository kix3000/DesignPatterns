package com.github.kix3000;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}