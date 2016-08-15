package com.github.kix3000;

public class Main {

    public static void main(String[] args) {
        System.out.println("Starting main...\n");

        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();

    }
}
