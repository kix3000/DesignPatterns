package com.github.kix3000;

import com.github.kix3000.model.Shape;
import com.github.kix3000.model.ShapeFactory;

public class Main {

    public static void main(String[] args) {
        System.out.println("Starting main...");

        ShapeFactory factory = new ShapeFactory();

        Shape square = factory.getShape("square");
        Shape rectangle = factory.getShape("rectangle");
        Shape circle = factory.getShape("circle");

        square.draw();
        rectangle.draw();
        circle.draw();
    }
}
