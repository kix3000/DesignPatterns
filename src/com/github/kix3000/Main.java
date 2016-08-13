package com.github.kix3000;

import com.github.kix3000.model.color.Color;
import com.github.kix3000.model.factory.AbstractFactory;
import com.github.kix3000.model.factory.FactoryProducer;
import com.github.kix3000.model.shape.Shape;

public class Main {

    public static void main(String[] args) {
        System.out.println("Starting main...");

        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();

        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();

        Shape square = shapeFactory.getShape("SQUARE");
        square.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        Color red = colorFactory.getColor("RED");
        red.fill();

        Color green = colorFactory.getColor("Green");
        green.fill();

        Color blue = colorFactory.getColor("BLUE");
        blue.fill();
    }
}
