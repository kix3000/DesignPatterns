package com.github.kix3000;

public class Main {

    public static void main(String[] args) {
        System.out.println("Starting main...\n");

        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
