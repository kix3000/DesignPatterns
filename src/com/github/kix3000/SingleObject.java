package com.github.kix3000;

public class SingleObject {

    private static SingleObject instance = null;

    private SingleObject() {

    }

    public static SingleObject getInstance(){
        if (instance == null) {
            instance = new SingleObject();
        }
        return instance;
    }

    public void showMessage(){
        System.out.println("Showing message...");
    }
}