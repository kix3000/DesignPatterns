package com.github.kix3000.model;

import com.github.kix3000.model.Circle;
import com.github.kix3000.model.Rectangle;
import com.github.kix3000.model.Shape;
import com.github.kix3000.model.Square;

public class ShapeFactory {
    public Shape getShape(String shapeType) {
        if(shapeType == null) {
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();

        } else if(shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();

        } else if(shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }

        return null;
    }
}
