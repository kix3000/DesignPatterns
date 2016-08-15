package com.github.kix3000;

public class Main {

    public static void main(String[] args) {
        System.out.println("Starting main...\n");

        Image image = new ProxyImage("test_10mb.jpg");

        image.display();
        System.out.println();

        image.display();
    }
}
