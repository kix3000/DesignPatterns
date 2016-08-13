package com.github.kix3000.model.factory;

import com.github.kix3000.model.color.Blue;
import com.github.kix3000.model.color.Color;
import com.github.kix3000.model.color.Green;
import com.github.kix3000.model.color.Red;
import com.github.kix3000.model.shape.Shape;

public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType){
        return null;
    }

    @Override
    public Color getColor(String color) {

        if(color == null){
            return null;
        }

        if(color.equalsIgnoreCase("RED")){
            return new Red();

        }else if(color.equalsIgnoreCase("GREEN")){
            return new Green();

        }else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }

        return null;
    }
}
